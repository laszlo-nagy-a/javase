package formatlocaleprintf;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Run {

    private String userName;

    private List<Double> runKilometers;

    public Run(String userName, List<Double> runKilometers) {
        this.userName = userName;
        this.runKilometers = runKilometers;
    }

    public void addRun(double km) {
        if(runKilometers != null) {
            runKilometers.add(km);
        }
    }

    public String printFormattedRunText() {
        final String formattedDate = DateFormat.getDateInstance(DateFormat.MEDIUM).format(new Date());
        return String.format(Locale.US,
                "Kedves %s! A mai dátum: %S. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!",
                userName,
                formattedDate,
                runKilometers.size(),
                runKilometers.getLast()
        );

    }

    public static void main(String[] args) {
        List<Double> kmsRun = new ArrayList<>();
        kmsRun.add(1.2D);
        kmsRun.add(2.2D);
        kmsRun.add(4.6789D);
        kmsRun.add(10.123D);

        Run run = new Run("Laszlo", kmsRun);
        run.addRun(123.654654D);
        System.out.println(run.printFormattedRunText());
    }
}
