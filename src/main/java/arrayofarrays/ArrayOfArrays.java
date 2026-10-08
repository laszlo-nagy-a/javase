package arrayofarrays;

public class ArrayOfArrays {
    public static void main(String[] args) {
        printArrayOfArrays(new int[][]{{0, 1 ,2}, {0, 1, 2}, {0, 1, 2}});
    }

    public static void printArrayOfArrays(int[][] a) {
        for (int[] row : a) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
