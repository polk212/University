package base;

public class Address {
    private String town;
    private String street;
    private int house;
    private int flat;

    public Address(String town, String street, int house, int flat) {
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public void setAddress(String town, String street, int house, int flat) {
        this.town = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getTown() {
        return this.town;
    }

    public String getStreet() {
        return this.street;
    }

    public int getHouse() {
        return this.house;
    }

    public int getFlat() {
        return this.flat;
    }

    public void getAddress() {
        System.out.println("Info about address: " + this.town + " " + this.street + " " + this.house + " " + this.flat);
    }


}
