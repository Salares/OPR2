package ukol1;

public class Address {
    private String city;
    private String state;
    private String street;
    private String bin;

    public Address(String city, String state, String street, String bin) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.bin = bin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }
}
