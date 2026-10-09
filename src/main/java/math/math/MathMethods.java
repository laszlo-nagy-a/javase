package math.math;

import java.util.Random;

public class MathMethods {
    public static void main(String[] args) {
        System.out.println(Math.max(1, 2));
        System.out.println(Math.min(1, 2));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI));
        Random random = new Random();
        System.out.println(random.nextDouble());
        System.out.println(Math.abs(-10));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(1, 2));
        System.out.println(Math.subtractExact(2, 1));
        System.out.println(Math.multiplyExact(2, 2));
        System.out.println(Math.pow(3, 3));
        System.out.println(Math.incrementExact(3));
        System.out.println(Math.decrementExact(3));
    }
}
