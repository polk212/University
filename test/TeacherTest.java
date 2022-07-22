package service;


import base.Address;
import base.Teacher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeacherTest {
    private Address one;
    private Teacher t1;
    private Teacher t2;

    @Before
    public void setUp() throws Exception {
        one = new Address("Lida","Sovetskaya",5,34);
        t1 = new Teacher("Jo","Vong","m",45,one);
        t2 = new Teacher("Jo","Li","m",35,one);
    }

    @Test
    public void checkSalary() {
        t1.salary(24);
        t2.salary(25);

        Assert.assertTrue(t1.salary(24)>60);
        Assert.assertTrue(t2.salary(25)<68);

    }
}