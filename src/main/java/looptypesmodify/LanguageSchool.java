package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        Student activeStudent = new Student("Peter");
        Student inactiveStudent = new Student("Laszlo");
        inactiveStudent.setActive(false);

        List<Student> studentList = new ArrayList<>(Arrays.asList(activeStudent, inactiveStudent));
        List<Student> inacticeStudentList = new ArrayList<>();

        for (Student student : studentList) {
            if(!student.isActive()) {
                inacticeStudentList.add(student);
            }
        }

        studentList.removeAll(inacticeStudentList);

        for(Student student : studentList) {
            System.out.println(student.getName());
        }
    }
}
