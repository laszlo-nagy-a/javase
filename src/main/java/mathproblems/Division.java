package mathproblems;

public class Division {

    public static void main(String[] args) {
        new Division().getDivisors(12);
    }

    void getDivisors(int number) {
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }
}
