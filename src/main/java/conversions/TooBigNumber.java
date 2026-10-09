package conversions;

public class TooBigNumber {

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(10));

        Digits digits = new Digits();
        digits.addDigitsToList("k4asdvm?123*_0");
        for(int i : digits.getIntNumbers()) {
            System.out.println(i);
        }
    }

    long getRightResult(int number) {
        return 2_147_483_647L + number;
    }
}
