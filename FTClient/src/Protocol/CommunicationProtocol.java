package Protocol;

import Protocol.Client;
import java.io.File;
import java.io.Serializable;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Cristian
 */
public class CommunicationProtocol implements Serializable {
    //Mensagens
    private String codeProtocol;
    private String message;
    private String nameSender;
    private String nameTarget;
    //Pedir/atualizar recursos
    private String fileForRequest;
    private File[] filesForUpdate;
    private int portForSendingFile;
    //Login
    private Client clientForLogin;
    //Clientes ativos
    private List<Client> activeClients;
    //Grupo multicast
    private String grupoMulticast;
    private int grupoMulticastPorto;
    
    
    public CommunicationProtocol(String aCodeProtocol){
        codeProtocol = aCodeProtocol;
    }
    
    public CommunicationProtocol(){
        //Empty Constructor
    }
    
    
    

    public void setCodeProtocol(String codeProtocol) {
        this.codeProtocol = codeProtocol;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setClientForLogin(Client clientForLogin) {
        this.clientForLogin = clientForLogin;
    }

    public void setActiveClients(List<Client> activeClients) {
        this.activeClients = activeClients;
    }

    public void setGrupoMulticast(String grupoMulticast) {
        this.grupoMulticast = grupoMulticast;
    }

    public void setGrupoMulticastPorto(int grupoMulticastPorto) {
        this.grupoMulticastPorto = grupoMulticastPorto;
    }

    public void setFileForRequest(String fileForRequest) {
        this.fileForRequest = fileForRequest;
    }

    public void setFilesForUpdate(File[] filesForUpdate) {
        this.filesForUpdate = filesForUpdate;
    }
    
    public void setPortForSendingFile(int portForSendingFile) {
        this.portForSendingFile = portForSendingFile;
    }

    public void setNameSender(String nameSender) {
        this.nameSender = nameSender;
    }

    public void setNameTarget(String nameTarget) {
        this.nameTarget = nameTarget;
    }
    
    
    
    
    
    
    public Client getClientForLogin() {
        return clientForLogin;
    }
    
    public String getCodeProtocol() {
        return codeProtocol;
    }

    public String getMessage() {
        return message;
    }

    public List<Client> getActiveClients() {
        return activeClients;
    }

    public String getGrupoMulticast() {
        return grupoMulticast;
    }

    public int getGrupoMulticastPorto() {
        return grupoMulticastPorto;
    }

    public String getFileForRequest() {
        return fileForRequest;
    }

    public File[] getFilesForUpdate() {
        return filesForUpdate;
    }
    
    public int getPortForSendingFile() {
        return portForSendingFile;
    }

    public String getNameSender() {
        return nameSender;
    }

    public String getNameTarget() {
        return nameTarget;
    }
     
    
    
}