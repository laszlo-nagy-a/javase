package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("test", "id123", new Address("Hungary", "Budapest", "XY street 1", "1000"));
        System.out.println(person.personToString());
        person.correctData("test2", "id321");
        person.moveTo(new Address("Hungary", "Szeged", "xy", "6700"));
        System.out.println(person.personToString());
    }
}
