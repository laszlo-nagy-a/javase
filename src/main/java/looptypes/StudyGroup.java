package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Csaba", "Péter Aladár", "Kakaó Béla", "Manyovszky Sándor Emil");

        List<List<String>> groupedStudentNames = printStudyGroups(studentNames);

        for(int i = 0; i < groupedStudentNames.size(); i++) {
            System.out.println((i + 1) + ". csoport:" + groupedStudentNames.get(i));
        }
    }



    static List<List<String>> printStudyGroups(List<String> students) {
        List<List<String>> studyGroups = new ArrayList<>();
        List<String> firstGroup = new ArrayList<>();
        List<String> secondGroup = new ArrayList<>();
        for(String student: students) {

            if(student.length() <= 10) {
                firstGroup.add(student);
            } else {
                secondGroup.add(student);
            }
        }
        studyGroups.add(firstGroup);
        studyGroups.add(secondGroup);

        return studyGroups;
    }
}
