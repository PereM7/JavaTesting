package DomainEntities;

import JavaTesting.Resources.PasswordUtils;

public class User {
    private String name;
    private String password;
    private String salt; //Canvia a cada usuari
    //password == Hash(password + slat)

    public User () {
        name = "Tomeu";
        password = "secret";
    }
    public User (String name, String pass){
        this.name = name;
        setPassword(pass);
        this.salt = PasswordUtils.generarSalt();
    }


    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public boolean verificarPassword (String passwordEntrada) {
        return PasswordUtils.verifyUserPassword(passwordEntrada, salt, password);
    }
    public void setPassword (String pass) {
        this.password = PasswordUtils.hashedPassword(pass, salt);
    }


}
