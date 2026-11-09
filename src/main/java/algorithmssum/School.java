package algorithmssum;

import java.util.List;

public class School {

    public static void main(String[] args) {
        Student student1 = new Student("name1", 1);
        Student student2 = new Student("name2", 2);

        System.out.println(sumStudentGradeByStudentList(List.of(student1, student2)));
    }

    static int sumStudentGradeByStudentList(List<Student> studentList) {
        int i  = 0;
        for (Student student : studentList) {
            i += student.getGrade();
        }

        return i;
    };
}
