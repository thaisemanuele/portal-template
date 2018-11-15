package dwsession.api;

import java.security.Principal;

public class User implements Principal {

    private final long id;
    private final String name;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{  " +
                "     id='" + id + '\'' +
                    ",name='" + name + '\'' +
                '}';
    }
}
