package model;

import org.mindrot.jbcrypt.BCrypt;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String username;
    private String passwordHash;

    public Usuario(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return BCrypt.checkpw(password, passwordHash);
    }

    private void setPassword(String password) {
        this.passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
