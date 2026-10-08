package introdate;

import java.time.LocalDateTime;

public class University {
    public static void main(String[] args) {
        Exam exam1 = new Exam("Math", LocalDateTime.of(2020, 1, 1, 1, 1 ,1));
        Exam exam2 = new Exam("Informatics", LocalDateTime.of(2021, 1, 1, 1, 1 ,1));

        System.out.println(exam1.getMessage());
        System.out.println(
                "Exam 1: " + exam1.getSubject() + "\r\n" +
                "Year: " + exam1.getExamDate().getYear() + "\r\n" +
                "Month: " + exam1.getExamDate().getMonth() + "\r\n"  +
                "Day: " + exam1.getExamDate().getDayOfMonth() + "\r\n" +
                "Hour: " + exam1.getExamDate().getHour() + "\r\n" +
                "Minute: " + exam1.getExamDate().getMinute() + "\r\n" +
                "Second: " + exam1.getExamDate().getSecond() + "\r\n"
        );

        System.out.println(exam1.getExamDate().isAfter(exam2.getExamDate()));
        System.out.println(exam1.getExamDate().isBefore(exam2.getExamDate()));
    }
}
