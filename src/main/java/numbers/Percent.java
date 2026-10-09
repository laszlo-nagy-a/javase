package numbers;

public class Percent {

    public static void main(String[] args) {
        System.out.println(new Percent().getValue(200, 20));
        System.out.println(new Percent().getBase(50, 25));
    }

    double getValue(int a, int b) {
        return 100 / ((double) a / b);
    }

    double getBase(int number, int percentage) {
        return ((double)100 / percentage) * number;
    }
}
