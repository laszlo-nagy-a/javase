package array;

public class ArrayHandler {

    public static void main(String[] args) {
        int[] indexArray = {1, 2, 3};
        addIndexToNumber(indexArray);
        for(int item : indexArray) {
            System.out.print(item + " ");
        }
        System.out.println();

        String[] stringArray = {"a", "b", "c"};
        concatenateIndexToWord(stringArray);
        for(String item : stringArray) {
            System.out.print(item + " ");
        }
    }

    static void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    static void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }
}
