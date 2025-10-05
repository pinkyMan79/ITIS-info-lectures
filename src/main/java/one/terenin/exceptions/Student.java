package one.terenin.exceptions;

public class Student {

    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        if (age <= 0) {
            throw new MyException("Age is 0");
        }
        this.age = age;
    }


}
