package arrays;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        System.out.println(numberOfDays());
        System.out.println(multiplicationTableAsString(5));
        System.out.println(sameTempValues(new double[] {1.0, 2.0}, new double[] {1.0, 2.0}));
        System.out.println(sameTempValuesDayLight(new double[] {1.0, 2.2}, new double[] {1.0}));

        int[] winningNumbers = {1, 2, 15, 10};
        int[] numbersInGame = {2, 1, 10, 15};
        int[] winningNumbersCopy = Arrays.copyOf(winningNumbers, winningNumbers.length);
        int[] numbersInGameCopy = Arrays.copyOf(numbersInGame, numbersInGame.length);

        System.out.println(sameTempValuesDayLight(winningNumbers, numbersInGame));
        final boolean modifiedSortingOnArrays = Arrays.equals(winningNumbers, winningNumbersCopy) || Arrays.equals(numbersInGame, numbersInGameCopy);
        System.out.println("Modified sorting: " + !modifiedSortingOnArrays);
    }

    static String numberOfDays() {
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

            for(int j = 0; j < monthAndDays[i].length; j++) {
                monthAndDays[i][j] = j + 1;
            }
        }

        return Arrays.deepToString(monthAndDays);
    }

    static String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][size];
        for(int i = 0; i < multiplicationTable.length; i++) {
            for(int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (j + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    static boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    static boolean sameTempValuesDayLight(double[] day, double[] anotherDay) {
       if(day.length != anotherDay.length) {
           int comparingDayNumber = min(day.length, anotherDay.length);
           return Arrays.equals(Arrays.copyOf(day, comparingDayNumber), Arrays.copyOf(anotherDay, comparingDayNumber));
       }

        return Arrays.equals(day, anotherDay);
    }

    static int min(int a, int b) {
        return a <= b ? a : b;
    }

    static boolean sameTempValuesDayLight(int[] numbersInGame, int[] winningNumbers) {
        int[] numbersInGameCopy = Arrays.copyOf(numbersInGame, numbersInGame.length);
        int[] winningNumberCopy = Arrays.copyOf(winningNumbers, winningNumbers.length);

        Arrays.sort(numbersInGameCopy);
        Arrays.sort(winningNumberCopy);
        return Arrays.equals(numbersInGameCopy, winningNumberCopy);
    }
}
