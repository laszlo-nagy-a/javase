package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(days[1]);
        System.out.println("Tömb hossza:" + days.length);

        int[] twoPower = new int[5];

        for(int i = 0; i < twoPower.length; i++){
            if(i == 0) {
                twoPower[i] = 1;
            } else {
                twoPower[i] = twoPower[i-1] * 2;
            }
        }

        for(int item : twoPower){
            System.out.print(item + " ");
        }

        boolean[] booleanArray = new boolean[6];
        booleanArray[0] = false;

        for(int i = 1; i < booleanArray.length; i++){
            booleanArray[i] = !booleanArray[i-1];
        }

        for(boolean item : booleanArray) {
            System.out.print(item + " ");
        }
    }
}
