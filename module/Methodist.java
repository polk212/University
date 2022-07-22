package util;

import base.Address;
import base.People;
import base.Teacher;

import java.util.ArrayList;

public class Methodist extends People {

    private ArrayList<Teacher> methodist;

    public Methodist(String name, String surname, String gender, int age, Address address) {
        super(name, surname, gender, age, address);
    }

    public ArrayList<Teacher> getMethodist() {
        return methodist;
    }

    public void setMethodist(ArrayList<Teacher> methodist) {
        this.methodist = methodist;
    }
}
