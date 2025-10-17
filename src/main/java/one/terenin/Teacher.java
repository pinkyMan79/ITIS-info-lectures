package one.terenin;

public class Teacher {

    public String name;
    public int age;
    public StudentList studentList;

    public Teacher(String name, int age, StudentList studentList) {
        this.name = name;
        this.age = age;
        this.studentList = studentList;
    }

    public void setMarks() {
        for (Student student : studentList.getAllStudents()) {
            student.setGrade(5);
        }
    }

}
