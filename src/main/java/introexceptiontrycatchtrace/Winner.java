package introexceptiontrycatchtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Winner {

    private List<String> name = new ArrayList<>();
    private Random random;

    public Winner() {
        init();
    }

    private void init() {
        random = new Random();
        name.add("Peter");
        name.add("Laszlo");
        name.add("Istvan");
        name.add("Dora");
        name.add(null);
    }

    public String getWinner() {
        return name.get(random.nextInt(10));
    }
}
