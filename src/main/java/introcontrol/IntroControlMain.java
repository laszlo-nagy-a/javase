package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println("CALCULATE BONUS");
        System.out.println(introControl.calculateBonus(1_000_001));

        System.out.println("SUBTRACT TEN IF GREATER THAN TEN");
        System.out.println(introControl.subtractTenIfGreaterThanTen(11));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));

        System.out.println("DESCRIBE NUMBER");
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(1));

        System.out.println("GREETING JOE");
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("L"));

        System.out.println("CALCULATE CONSUMPTION");
        System.out.println(introControl.calculateConsumption(1, 2));
        System.out.println(introControl.calculateConsumption(0, 9999));

        System.out.println("PRINTNUMBERS");
        introControl.printNumbers(5);

        System.out.println("PRINTNUMBERSBETWEEN");
        introControl.printNumbersBetween(10, 12);

        System.out.println("PRINTNUMBERSBETWEENANYDIRECTION");
        introControl.printNumbersBetweenAnyDirection(12,10);
        introControl.printNumbersBetweenAnyDirection(10,12);

        System.out.println("PRINTODDNUMBERS");
        introControl.printOddNumbers(11);
    }
}
