package algorithmsdecision;

import java.util.List;

public class Town {

    public static void main(String[] args) {
        System.out.println(containsFewerHabitants(List.of(1, 2, 3, 4), 3));
        System.out.println(containsFewerHabitants(List.of(1, 2, 3, 4), 5));
    }

    static boolean containsFewerHabitants(List<Integer> habitantCountList, int minimum) {
        for(int habitantCount : habitantCountList) {
            if(habitantCount > minimum) {
                return true;
            }
        }

        return false;
    }
}
