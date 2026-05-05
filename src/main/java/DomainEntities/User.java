package DomainEntities;

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
