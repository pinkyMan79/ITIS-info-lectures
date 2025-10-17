package one.terenin;

public class StudentList {

    public Student[] students;

    public StudentList() {
        students = new Student[2];
        students[0] = new Student(10, "John");
        students[1] = new Student(20, "Jane");
    }

    public void setAllStudents(Student[] students) {
        this.students = students;
    }

    public Student[] getAllStudents() {
        return null;
    }

}
