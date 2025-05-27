package Protocol;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Cristian
 */
public class Client implements Serializable{
    private String nome;
    private String ipv4;
    private int portNetwork;
    private File[] files;
    
    public Client(String aNome, String aIpv4, int aPortNetwork, File[] aFiles){
        ipv4 = aIpv4;
        nome = aNome;
        portNetwork = aPortNetwork;
        files = aFiles;
    }

    public String getNome() {
        return nome;
    }

    public String getIpv4() {
        return ipv4;
    }

    public File[] getFiles() {
        return files;
    }

    public int getPortNetwork() {
        return portNetwork;
    }

    
    
    public void setFiles(File[] files) {
        this.files = files;
    }
       
}
