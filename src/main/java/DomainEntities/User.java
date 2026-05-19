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
        this.password = pass;
        this.salt = PasswordUtils.generarSalt();
    }


    public String getName () {
        return this.name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String getPassword () {
        return this.password;
    }
    public void setPassword (String pass) {
        this.password = pass;
    }
}
