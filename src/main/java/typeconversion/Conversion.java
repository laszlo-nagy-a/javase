package typeconversion;

public class Conversion {

    public static void main(String[] args) {
        System.out.println(new Conversion().getFirstDecimal(10.1));
        System.out.println(10.1 - 10.0);
    }

    int getFirstDecimal(double num) {
        int whole = (int) num;
        return (int) ((num - whole) * 10);
    }
}
