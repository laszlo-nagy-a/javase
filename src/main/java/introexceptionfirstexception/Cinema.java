package introexceptionfirstexception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        System.out.print("Kérem adja meg a nevét: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println();
        System.out.print("Kérem adja meg melyik filmre szeretné a jegyet foglalni: ");
        String movie = scanner.nextLine();

        System.out.println();
        System.out.print("Kérem adja meg, hány jegyet szeretne foglalni: ");
        int bookingTicketQuantity = scanner.nextInt();

        int counter = 0;
        List<Integer> lineNumber = new ArrayList<>();
        List<Integer> seatNumber = new ArrayList<>();
        do {
            int nThTicket = counter + 1;
            System.out.printf("Kérem adja meg, hogy melyik sorban szeretné foglalni a %d. jegyet: ", nThTicket);
            lineNumber.add(scanner.nextInt());

            System.out.printf("Kérem adja meg, hogy melyik székre szeretné foglalni a %d. jegyet: ", nThTicket);
            seatNumber.add(scanner.nextInt());

            counter++;
        } while(counter < bookingTicketQuantity);

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: ");
        StringBuffer sb = new StringBuffer("Vásárló neve: ");
        sb.append(name);
        sb.append("\n");
        sb.append("Film címe: ");
        sb.append(movie);
        sb.append("\n");
        sb.append("Lefoglalt helyek: ");

        for(int i = 0; i < bookingTicketQuantity; i++) {
            sb.append(lineNumber.get(i));
            sb.append(". sor ");
            sb.append(seatNumber.get(i));
            sb.append(". szék ");
        }
        sb.append("\n");
        sb.append("Jó szórakozást!");
        System.out.println(sb);
    }
}
