package arrayofarrays;

public class DailyValues {

    public static void main(String[] args) {
        for(int[] row : getValues()) {
            for(int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    static int[][] getValues() {
        int[][] monthAndDays = new int[12][];
        for(int i = 0; i < monthAndDays.length; i++) {
            if(i == 0) {
                monthAndDays[i] = new int[31];
            } if(i == 1) {
                monthAndDays[i] = new int[28];
            } if(i == 2) {
                monthAndDays[i] = new int[31];
            } if(i == 3) {
                monthAndDays[i] = new int[30];
            } if(i == 4) {
                monthAndDays[i] = new int[31];
            } if(i == 5) {
                monthAndDays[i] = new int[30];
            } if(i == 6) {
                monthAndDays[i] = new int[31];
            } if(i == 7) {
                monthAndDays[i] = new int[31];
            } if(i == 8) {
                monthAndDays[i] = new int[30];
            } if(i == 9) {
                monthAndDays[i] = new int[31];
            }if(i == 10) {
                monthAndDays[i] = new int[30];
            }if(i == 11) {
                monthAndDays[i] = new int[31];
            }
        }

        return monthAndDays;
    }
}
