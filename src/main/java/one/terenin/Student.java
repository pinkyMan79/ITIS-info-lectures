package one.terenin;

public class Student {

    int age;
    String name;
    int grade;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
