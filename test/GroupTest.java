package service;

import base.Address;
import base.Group;
import base.Student;
import base.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GroupTest {
    private Address one;
    private Teacher mrSol;

    private Student st1, st2;
    private Group g1;


    @Test
    public void setStudent() {
        one = new Address("Xi","limp",5,78);
        mrSol = new Teacher("NiK","Sol","m",43,one);

        st1 = new Student("Jo","Mi","m",23,one);
        st2 = new Student("Jim","Minolta","m",24,one);

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(st1);
        students1.add(st2);

        Group g2expected = g1;

        g1 = new Group("11234",3,students1,mrSol,2020,2024);

        g1.addStudent(new Student("Vic","Mi","f",20,one));

        Assert.assertEquals(g1,g2expected);

    }
}