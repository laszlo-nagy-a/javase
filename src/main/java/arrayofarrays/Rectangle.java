package arrayofarrays;

public class Rectangle {

    public static void main(String[] args) {
        for(int[] row : rectangularMatrix(3)) {
            for(int item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    static int[][] rectangularMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i;
            }
        }

        return matrix;
    }
}
