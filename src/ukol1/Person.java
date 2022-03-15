package ukol1;

public abstract class Person {
    private String name;
    private static Integer id = 1;
    private String email;
    private String telephone;
    private Address address;

    public Person(String name, String email, String telephone, Address address) {
        this.name = name;
        this.id++;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public static Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person:" +
                "name: " + name + '\n' +
                "email: " + email + '\n' +
                "telephone: " + telephone + '\n' +
                "address: " + address.toString() + '\n';
    }
}
