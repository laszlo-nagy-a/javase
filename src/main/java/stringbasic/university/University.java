package stringbasic.university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public boolean areEqual(Student student, Student other) {
        String studentNeptunCode = student.getNeptunCode();
        String otherStudentNeptunCode = other.getNeptunCode();
        String studentBelepoKartyaSzam = student.getBelepoKartyaSzam();
        String otherStudentBelepoKartyaSzam = other.getBelepoKartyaSzam();

        return studentNeptunCode.equals(otherStudentNeptunCode) && studentBelepoKartyaSzam.equals(otherStudentBelepoKartyaSzam);
    }
}
