package solid.domain;

public class Custom {
    private final String id;
    private final String name;
    private final String email;
    private final String phone;
    
    public Custom(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String id() {
        return id;
    }
    public String name() {
        return name;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

}