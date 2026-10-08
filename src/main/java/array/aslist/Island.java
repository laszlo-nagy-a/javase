package array.aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Guitar", "SteamDeck", "Bag");
        System.out.println(importantThings);

        Scanner sc = new Scanner(System.in);
        List<String> importantThingsChangeable = new ArrayList<>(Arrays.asList("Guitar", "SteamDeck", "Bag"));
        System.out.println("Which item do you want to change? (Write the number)");
        for(int i = 0; i < importantThingsChangeable.size(); i++) {
            System.out.println(i + " - " + importantThingsChangeable.get(i));
        }

        int choiceToSwitch = sc.nextInt();
        System.out.println("Which item do you want to bring?");
        sc.nextLine();
        String newItem = sc.nextLine();

        importantThingsChangeable.set(choiceToSwitch, newItem);

        System.out.println("Current items to bring the island are");
        System.out.println(importantThingsChangeable);
    }
}
