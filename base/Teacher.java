package base;

public class Teacher extends People {
    public Teacher(String name, String surname, String gender, int age, Address address) {
        super(name, surname, gender, age, address);
    }
    public void displayTeacher() {

        System.out.println("Info about teacher: " + super.getName() + " " + super.getSurname() + " " + super.getGender() + " " + super.getAge() + " Info about adress: " + super.getAddress().getTown() + " " + super.getAddress().getHouse() + " " + super.getAddress().getStreet() + " " + super.getAddress().getFlat());
    }
    public double salary(int hours) {
        int cost = 9;
        double salary = (double)(hours * cost) * 0.3;
        System.out.println("Salary in the end of month " + super.getName() + " " + super.getSurname() + ": " + salary + " $");
        return salary;
    }
}
