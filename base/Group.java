package base;

import java.util.ArrayList;

public class Group {
    private int yearStart;
    private int yearEnd;
    private String nameGroup;
    private int course;
    private ArrayList<Student> student;
    private Teacher teacher;

    public String getNameGroup() {
        return this.nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public ArrayList<Student> getStudent() {
        return this.student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public Group(String nameGroup, int course, ArrayList<Student> student, Teacher teacher, int yearStart, int yearEnd) {
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
        this.nameGroup = nameGroup;
        this.course = course;
        this.student = student;
        this.teacher = teacher;
    }

    public int getYearStart() {
        return this.yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return this.yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    public void addStudent(Student newStudent) {
        this.student.add(newStudent);
    }

    public void deleteStudent(Student expelledStudent) {
        this.student.remove(expelledStudent);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void displayGroup() {

        System.out.println("Info about group: " + this.nameGroup + " " + this.course + " Info about teacher: " + this.teacher.getName() + this.teacher.getSurname());
    }
}
