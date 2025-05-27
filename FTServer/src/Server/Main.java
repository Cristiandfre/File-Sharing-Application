package Server;


import Protocol.Client;
import java.io.File;
import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Cristian
 */
public class Main {
    static List<Client> clientesLigados;
    static InetAddress grupoMulticastInet;
    static int grupoMulticastPorto;
    
    public static void main(String[] args){
        inicializarConfig();
        
    }
    
    private static void inicializarConfig(){
        //Inicializar variaveis
        clientesLigados = Collections.synchronizedList(new ArrayList<Client>());
        Scanner scan = new Scanner(System.in);
        
        //Obter porto
        int port;
        while(true){
            System.out.print("Insira o porto: ");
            try{
                port = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Porto invalido, tente novamente\n");
                continue;
            }
            break;
        }
        
        //Obter grupo multicast
        while(true){
            System.out.print("Insira o grupo multicast: ");
            String grupoMulticast = scan.nextLine();
            try {
                grupoMulticastInet = InetAddress.getByName(grupoMulticast);
            } catch (UnknownHostException ex) {
                System.out.println("Grupo multicast invalido, tente novamente\n");
                continue;
            }
            break;
        }
        
        //Obter porto do grupo multicast
        while(true){
            System.out.print("Insira o porto do grupo multicast: ");
            try{
                grupoMulticastPorto = Integer.parseInt(scan.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Porto invalido, tente novamente\n");
                continue;
            }
            break;
        }
        
        //Levantar servidor
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();
            ServerSocket serverSocket = new ServerSocket(port);
            
            System.out.println("Servidor levantado em\nEndereco IPv4 : " + inetAddress.getHostAddress() + "\n" + "Porto : " + String.valueOf(port) + "\n");
            
            while(true){
                Socket clientSocket = serverSocket.accept();
                System.out.println("Ligacao recebida de cliente desde: " + clientSocket.getInetAddress().getHostAddress());
                
                //Enviar ligação a uma thread aparte
                new Thread(new ClientConnectionHandler(clientSocket, clientesLigados, grupoMulticastInet, grupoMulticastPorto)).start();
                
                /*for(Client client : clientesLigados){
                    System.out.println("------------------------CLIENTE--------------------------------");
                    System.out.println(client.getNome() + "\n");
                    System.out.println(client.getIpv4() + "\n");
                    for(File file : client.getFiles()){
                        System.out.println(file.getName());
                    }
                    System.out.println("------------------------CLIENTE--------------------------------");
                }*/
            }
            
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
}
