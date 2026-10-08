package looptypes;

public class Sum {

    public static void main(String[] args) {
        printSums(new int[] {2, 6, 3, 5, 7, 9});
    }

    static void printSums(int[] numbers) {
        int[] answer = new int[numbers.length - 1];
        for(int i = 0; i < numbers.length - 1; i++) {
            answer[i] = numbers[i] + numbers[i + 1];
        }

        for(int item : answer) {
            System.out.print(item + " ");
        }
    }
}
