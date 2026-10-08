package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public static void main(String[] args) {
        int[] changedToZero = changeToZero(new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9});
        System.out.println(Arrays.toString(changedToZero));
    }

    static int[] changeToZero(int[] numbers) {
        for(int i = numbers.length - 1; i >= 0 ; i = i - 3) {
            numbers[i] = 0;
        }

        return numbers;
    }
}
