package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John");
        client.setAge(50);
        client.setAddress("Old address");

        System.out.println("John's data");
        System.out.println("Name: " + client.getName() + " Age: " + client.getAge() + " Address: " + client.getAddress());

        client.migrate("New address");
        System.out.println("The new address is: " + client.getAddress());
    }
}
