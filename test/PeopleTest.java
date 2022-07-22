package service;

import base.Address;
import base.Student;
import base.Teacher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {
    private Address one;

    @Test
    public void getAge() {
        one = new Address("York","Wellington",4,5);
        Teacher th = new Teacher("Ji","Vong","m",36,one);
        Student st1 = new Student("Jim","Beam","m",23,one);

        Assert.assertTrue(th.getAge()>0);
        Assert.assertTrue(st1.getAge()>0);

    }
}