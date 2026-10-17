package controlselection.greetings;

public class Greetings {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greeter(5, 1));
        System.out.println(greetings.greeter(9, 10));
        System.out.println(greetings.greeter(20, 0));
        System.out.println(greetings.greeter(21, 0));
    }


    private String greeter(int hour, int minute) {
        int minuteCountedWithHours = (hour * 60) + minute;
        if(minuteCountedWithHours > 5 * 60 && minuteCountedWithHours <= 9 * 60) {
            return "Jó reggelt";
        } else if(minuteCountedWithHours > 9 * 60 && minuteCountedWithHours <= ((18 * 60) + 30)) {
            return "Jó napot";
        } else if(minuteCountedWithHours <= 20 * 60) {
            return "Jó estét";
        } else {
            return "Jó éjt";
        }
    }
}
