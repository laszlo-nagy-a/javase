package typeconversion;

import java.util.Arrays;

public class Conversion {

    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println(conversion.getFirstDecimal(10.1));
        System.out.println(conversion.convertDoubleToDouble(10.1));
        System.out.println(Arrays.toString(conversion.convertIntArrayToByteArray(new int[]{5, -14, 6, 2, 125, 354, 9738, 3})));
    }

    int getFirstDecimal(double num) {
        int whole = (int) num;
        return (int) ((num - whole) * 10);
    }

    double convertDoubleToDouble(double num) {
        return (int) num;
    }

    byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] byteNumbers = new byte[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0 ||  numbers[i] > 127) {
                byteNumbers[i] = -1;
            } else {
                byteNumbers[i] = (byte) numbers[i];
            }
        }

        return byteNumbers;
    }
}
