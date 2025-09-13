import java.util.Arrays;
class Solution {

    public static int[][] transformMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0][0];

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        // TODO: Modify the loop to transpose the matrix in reverse order
        for (int col = cols - 1, i = 0; col >= 0; col--, i++) {
            for (int row = 0; row < rows; row++) {
                transposed[i][row] = matrix[row][col];
            }
        }
        return transposed;
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                if (matrix[row][col] != matrix[row + 1][col + 1]) {
                    return false;
                }

            }
        }
        return true;
    }


        public static void main (String[]args){
            int[][] seatingChart = {
                    {101, 102, 103, 104},
                    {201, 202, 203, 204},
                    {301, 302, 303, 304}
            };

            int[][] matrix = {{6, 7, 8}, {4, 6, 7}, {1, 4, 6}};
            // TODO: Store the result of transformMatrix in transposedSeating and print it
            //  System.out.println(Arrays.deepToString(transformMatrix(seatingChart)));
            System.out.println(isToeplitzMatrix(matrix));

        }
    }
