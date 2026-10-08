package debug;

public class Star {

    public void writeStars(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int prev = i == 0 ? 0 : numbers[i - 1];
            int stars = numbers[i] - prev;
            printStars(stars);
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int[] numbers = {1, 3, 5, 10, 12};
        star.writeStars(numbers);
    }
}