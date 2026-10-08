package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
    public static void main(String[] args) {
        final List<String> daysOfWeek = new ArrayList<>(Arrays.asList(
                "Hétfő",
                "Kedd",
                "Szerda",
                "Csütörötk",
                "Péntek",
                "Szombat",
                "Vasárnap"
        ));

        for(int i = 0; i < daysOfWeek.size(); i++) {
            if("Kedd".equals(daysOfWeek.get(i))) {
                daysOfWeek.set(i, "Szerda");
            }
        }

        System.out.println(daysOfWeek);
    }
}
