package array.aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your 1. favourite thing: ");
        favouriteThings.add(sc.nextLine());
        System.out.println("Please enter your 2. favourite thing: ");
        favouriteThings.add(sc.nextLine());

        System.out.println("Your favourite things are " + favouriteThings.size() + ":");
        System.out.println(favouriteThings);
    }


}
