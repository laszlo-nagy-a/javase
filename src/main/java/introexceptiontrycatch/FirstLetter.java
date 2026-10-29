package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("a");
        names.add("b");

        for(int i = 0; i <= names.size(); i++) {
            try {
                System.out.println(names.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Az indexen már nem érhető el érték, mert kisebb a lista mérete, mint: " + i);
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        }
    }

}
