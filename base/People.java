package base;

public abstract class People {
    private String name;
    private String surname;
    private String gender;
    private int age;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", gender='" + gender + '\'' +
                        ", age=" + age +
                        ", address=" + address.getTown()+" "+address.getStreet()+" "+address.getHouse()+" "+address.getFlat()+
                        '}';
    }

    private Address address;

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public People(String name, String surname, String gender, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
