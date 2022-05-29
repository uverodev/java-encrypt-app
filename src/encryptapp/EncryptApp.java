package encryptapp;

public class EncryptApp {

   
    public static void main(String[] args) {
        Encrypt en = new Encrypt();
        String clave = "xP*#9CFua3&K";
        String cifrado = en.getEncrypt(clave);
        String descifrado = en.getDecrypt(cifrado);
        
        System.out.println("Encriptar: "+clave+"\n"+cifrado);
        System.out.println("Desencriptar: "+cifrado+"\n"+descifrado);
    }
    
}
