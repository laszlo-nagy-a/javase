package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() ==  1) {
            System.out.println("Felhasználók listázása");
        } else if(sc.nextInt() ==  2) {
            System.out.println("Felhasználó felvétele");
        } else {
            System.out.println("");
        }

    }

}
