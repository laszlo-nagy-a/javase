package math.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> participants = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));

        Random random = new Random();
        int random1 = random.nextInt(0, 5);
        int random2 = random.nextInt(5, 10);

        System.out.println("The first winner is: " + participants.get(random1));
        System.out.println("The second winner is: " + participants.get(random2));
    }
}
