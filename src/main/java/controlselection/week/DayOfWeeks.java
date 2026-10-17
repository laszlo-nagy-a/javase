package controlselection.week;

public class DayOfWeeks {
    public static void main(String[] args) {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        try {
            System.out.println(dayOfWeeks.getStateOfWeekByWeekOfDay("hétfő"));
            System.out.println(dayOfWeeks.getStateOfWeekByWeekOfDay("szerda"));
            System.out.println(dayOfWeeks.getStateOfWeekByWeekOfDay("péntek"));
            System.out.println(dayOfWeeks.getStateOfWeekByWeekOfDay("szombat"));
            System.out.println(dayOfWeeks.getStateOfWeekByWeekOfDay("kakao"));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private String getStateOfWeekByWeekOfDay(String day) throws IllegalArgumentException {
        String dayAsLowerCase = day.toLowerCase();
        String stateOfWeek;
        switch(dayAsLowerCase) {
            case "hétfő":
                stateOfWeek = "Hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                stateOfWeek = "Hét közepe";
                break;
            case "péntek":
                stateOfWeek = "Majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                stateOfWeek = "Hétvége!";
                break;
            default:
                throw new IllegalArgumentException("Nem megfelelő adat lett megadva");
        }
        return stateOfWeek;
    }
}
