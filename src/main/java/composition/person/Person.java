package composition.person;

public class Person {
    private String name;
    private String idCard;
    private Address address;

    public Person(String name, String idCard, Address address) {
        this.name = name;
        this.idCard = idCard;
        this.address = address;
    }

    String personToString() {
        return name + ": " + idCard + " " + address.addressToString();
    }

    public void correctData(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public void moveTo(Address address) {
        this.address = address;
    }
}
