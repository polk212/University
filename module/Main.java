package module;

import base.Address;
import base.Group;
import base.Student;
import base.Teacher;
import util.AgeStudentCoparator;
import util.ConvertTeacherToMethodist;
import util.Methodist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main (String[] args) {

        Address one = new Address("Minsk", "Lenina", 13, 25);
        Address two = new Address ("Lida", "Bedy", 3, 1);
        Address three = new Address ("Volkovusk", "Sovetskaya", 14, 67);


        Student st1 = new Student("Jim","Bim","M",24,one);
        Student st2 =new Student ("Corban","Dallas","M",23,three);
        Student st3 =new Student ("Tyler","Durden","M",25,one);
        Student st4 =new Student ("Ji","Li","F",25,two);
        Student st5 =new Student ("Jo","Vong","M",20,two);

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(st1);
        students1.add(st2);

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(st3);
        students2.add(st4);
        students2.add(st5);

        Teacher mrBlack = new Teacher ("Carl", "Black", "M",52, three);
        Teacher mrDallas = new Teacher ("Korban", "Dallas", "M",90, one);
        Teacher mssSollars = new Teacher ("Kate", "Sollars", "F",87, two);
        Teacher mssHugh = new Teacher ("Nikole", "Hugh", "F",35, one);

        one.setAddress("Brest", "Mira", 13, 56);//изменение адреса

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(mrBlack);
        teachers.add(mssSollars);
        teachers.add(mrDallas);
        teachers.add(mssHugh);

        System.out.println();

        ConvertTeacherToMethodist<Teacher, Methodist> metodist = x->new Methodist(x.getName(),x.getSurname(),x.getGender(), x.getAge(), x.getAddress());
        //создание методиста
        Methodist mrBlackMetodist = metodist.convert(mrBlack);// конвертация учителя в методиста
        mrBlackMetodist.setMethodist(teachers);//назначение методисту списка подчиненных

        System.out.println("вывод списка учителей методиста");

        mrBlackMetodist.getMethodist().stream()
                .forEach(x-> System.out.println(x.toString()));// вывод списка учителей методиста

        System.out.println("вывод ФИО методиста");

        System.out.println(mrBlackMetodist.toString());//вывод ФИО методиста

        System.out.println("список учителей");

        teachers.stream()// список учителей
                .forEach(s-> System.out.println(s.toString()));

        System.out.println("проверка кто из учителей на пенсии");

        teachers.stream()//проверка кто из учителей на пенсии
                .filter(x->(x.getGender()=="F"&x.getAge()>55)|(x.getGender()=="M"&x.getAge()>65))
                .forEach(x-> System.out.println("Retired teachers: "+x.toString()));

        System.out.println();

        ArrayList<Double> salaries = new ArrayList<>();//расчет зарплаты
        salaries.add(mrBlack.salary(45));
        salaries.add(mrDallas.salary(20));
        salaries.add(mssSollars.salary(14));
        salaries.add(mssHugh.salary(34));

        System.out.println("список учителей чья зарплата больше 54$");

        salaries.stream()// список учителей чья зарплата больше 54$
                .filter(x->x.doubleValue()>55)
                .forEach(x-> System.out.println("Info about people whose salary exceeds 54$: "+x));

        System.out.println();

        Group groupOne = new Group ("113212", 3,students1, mssHugh,2021,2024);
        Group groupTwo = new Group ("123453", 3,students2, mrDallas,2021,2023);
        Group groupThree = new Group ("114523", 3,students2, mssSollars,2021,2022);
        Group groupFour = new Group ("110654", 3,students1, mrBlack,2021,2024);

        ArrayList<Group> groupList = new ArrayList<>();
        groupList.add(groupOne);
        groupList.add(groupTwo);
        groupList.add(groupThree);
        groupList.add(groupFour);

        System.out.println("список групп, что в диапазоне года выпуска");

        groupList.stream()//список групп, что в диапазоне года выпуска
                .filter(x->x.getYearEnd()>=2023 & x.getYearEnd()<2025)
                .forEach(s-> System.out.println("Info about group "+s.getNameGroup()));

        System.out.println();

        ArrayList<String> sortedPeople = new ArrayList<String>();
        sortedPeople.add(mrBlack.getName());
        sortedPeople.add(mrDallas.getName());
        sortedPeople.add(mssSollars.getName());
        sortedPeople.add(mssHugh.getName());
        sortedPeople.add(st1.getName());
        sortedPeople.add(st2.getName());
        sortedPeople.add(st3.getName());
        sortedPeople.add(st4.getName());

        System.out.println("локальная сортировка, например по имени людей");

        sortedPeople.stream().sorted()//локальная сортировка, например по имени людей
                .forEach(a-> System.out.println(a));

        System.out.println("сортировка compareTo первой группы студентов по возрасту");

        Collections.sort(students1);//сортировка compareTo студентов по возрасту
        System.out.println(students1);

        System.out.println("сортировка при помощи компаратора второй группы студентов по возрасту");
        Comparator ageComparator = new AgeStudentCoparator();
        Collections.sort(students2,ageComparator);
        System.out.println(students2);//сортировка студентов по возрасту

        groupOne.addStudent(st4);
        groupOne.setTeacher(mrDallas);

        System.out.println();
        groupOne.getStudent();
    }
}
