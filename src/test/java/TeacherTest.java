import one.terenin.Student;
import one.terenin.StudentList;
import one.terenin.Teacher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TeacherTest {

    public Teacher teacher;

    @BeforeEach
    public void setup() {
        StudentList list = Mockito.mock(StudentList.class);
        Student[] stud = new Student[]{ new Student (1, "mock")};
        Mockito.when(list.getAllStudents())
                .thenReturn(stud);
        teacher = new Teacher("Danila", 21, list);
    }

    @Test
    public void testTeacher() {
        teacher.setMarks();
        Assertions.assertEquals(5, teacher.studentList.getAllStudents()[0].getGrade());
    }

}
