package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("Intel I5", 5.5);
        PersonalComputer personalComputer = new PersonalComputer(cpu);
        Software software = new Software("IntelliJ Idea", 1.0);
        Hardware hardware = new Hardware("GTX 1050", "1.0");
        personalComputer.addHardware(hardware);
        personalComputer.addSoftware(software);

        System.out.println(personalComputer);
    }
}
