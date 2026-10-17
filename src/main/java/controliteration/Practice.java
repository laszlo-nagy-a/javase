package controliteration;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("###for###");
        for(int i = 1; i <= num; i++) {
            System.out.println(i);
        }
        System.out.println("#####");

        System.out.println("###do-while###");
        int i = num + 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
        System.out.println("#####");

        System.out.println("###while###");
        i = 1;
        while(i <= num) {
            System.out.println(i);
            i++;
        }
        System.out.println("#####");

    }
}
