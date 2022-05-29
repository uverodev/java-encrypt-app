package encryptapp;

import org.jasypt.util.text.BasicTextEncryptor;

public class Encrypt {

    private final String CLAVE = "";
    BasicTextEncryptor encrypter;

    public Encrypt() {
        encrypter = new BasicTextEncryptor();
        encrypter.setPassword(CLAVE);
    }

    public String getEncrypt(String clave) {
        return encrypter.encrypt(clave);
    }

    public String getDecrypt(String clave) {
        return encrypter.decrypt(clave);
    }

}
