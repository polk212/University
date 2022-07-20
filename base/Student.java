package base;

public class Student extends People implements Comparable<Student>{
    public Student(String name, String surname, String gender, int age, Address address) {
        super(name, surname, gender, age, address);
    }
    public void displayStudent() {

        System.out.println("Info about student: " + super.getName() + " " + super.getSurname() + " " + super.getGender() + " " + super.getAge() + " Info about adress: " + super.getAddress().getTown() + " " + super.getAddress().getHouse() + " " + super.getAddress().getStreet() + " " + super.getAddress().getFlat());
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
