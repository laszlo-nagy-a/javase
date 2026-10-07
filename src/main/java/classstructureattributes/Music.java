package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner sc = new Scanner(System.in);

        System.out.println("Favorite song");

        System.out.print("Please enter the name of the band: ");
        song.band = sc.nextLine();

        System.out.print("Please enter the name of the song: ");
        song.title = sc.nextLine();

        System.out.print("Enter the length of the song (in minutes): ");
        song.length = sc.nextInt();

        System.out.println(song.band + " - " + song.title + "(" + song.length + " perc)!");
    }
}
