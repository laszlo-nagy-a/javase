package formatlocaleprintf;

import java.util.List;

public class Thanks {

    public static void main(String[] args) {
        List<String> names = List.of("Peter", "Laszlo", "Roland", "Tamas");

        names.forEach(name -> {
            System.out.printf("Kedves %-6s! Örülünk, hogy termékünket választotta!\n", name);
        });
    }
}
