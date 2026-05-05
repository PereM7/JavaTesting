package DomainEntities;

public class User {
    private String name;
    private String password;

    public User () {
        name = "Tomeu";
        password = "secret";
    }

    public String getName () {
        return this.name;
    }

    public String getPassword () {
        return this.password;
    }
}
