package Test;

public class Solution1 {
    public int[][] generateMatrix(int A) {
        int[][] matrix = new int[A][A];
        int rowStart = 0;
        int rowEnd = A - 1;
        int colStart = 0;
        int colEnd = A - 1;
        int value = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = value++;
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = value++;
            }
            colEnd--;

            // Traverse left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    matrix[rowEnd][i] = value++;
                }
            }
            rowEnd--;

            // Traverse up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    matrix[i][colStart] = value++;
                }
            }
            colStart++;
        }

        return matrix;
    }

}



