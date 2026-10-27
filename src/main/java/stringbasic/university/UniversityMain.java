package stringbasic.university;

public class UniversityMain {
    public static void main(String[] args) {
        Person personOne = new Person("Nagy Marton 1", "nagy.marton1@test.hu", "123-456-789-1", "12345678-12345678-1", "+36123456789-1");
        Person personTwo = new Person("Nagy Marton 2", "nagy.marton2@test.hu", "123-456-789-2", "12345678-12345678-2", "+36123456789-2");
        Person personThree = new Person("Nagy Marton 3", "nagy.marton3@test.hu", "123-456-789-3", "12345678-12345678-3", "+36123456789-3");
        Person personFour = new Person("Nagy Marton 4", "nagy.marton4@test.hu", "123-456-789-4", "12345678-12345678-4", "+36123456789-4");

        Student studentOne = new Student(personOne, "nptn01", "ok1");
        studentOne.setBelepoKartyaSzam("01");
        Student studentTwo = new Student(personTwo, "nptn02", "ok2");
        studentTwo.setBelepoKartyaSzam("02");
        Student studentThree = new Student(personThree, "nptn03", "ok3");
        studentThree.setBelepoKartyaSzam("03");
        Student sameNeptunAndOktatasiAzonositoStudent = new Student(personFour, "nptn01", "ok1");
        sameNeptunAndOktatasiAzonositoStudent.setBelepoKartyaSzam("01");

        University university = new University();
        university.addStudent(studentOne);
        university.addStudent(studentTwo);
        university.addStudent(studentThree);
        university.addStudent(sameNeptunAndOktatasiAzonositoStudent);

        System.out.println(university.areEqual(studentOne, studentTwo));
        System.out.println(university.areEqual(studentTwo, studentThree));
        System.out.println(university.areEqual(studentThree, sameNeptunAndOktatasiAzonositoStudent));
        System.out.println(university.areEqual(studentOne, sameNeptunAndOktatasiAzonositoStudent));

    }
}
