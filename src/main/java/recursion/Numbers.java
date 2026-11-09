package recursion;

public class Numbers {

    public static void main(String[] args) {
        System.out.println(getNumbers(new int[]{1 ,2 ,3}, 3));
    }

    static int getNumbers(int[] numbers, int index) {
        if(index > 0) {
            getNumbers(numbers, index -1);
            return numbers[index - 1];
        }

        return 0;
    }
}
