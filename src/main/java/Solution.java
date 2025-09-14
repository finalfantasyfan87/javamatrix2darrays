import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public static int countLessThan(int[][] matrix, int target) {
        int rows = matrix[0].length;
        int cols = matrix.length;
        int counter = 0;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0) {
            if (matrix[row][col] < target) {
                counter += col + 1;
                row++;
            } else {
                col--;
            }
        }
        return counter;
    }

    public static List<Integer> solution(int[][] grid) {
        if (grid.length == 0) {
            return Arrays.asList(null, null);
        }
        int columns = grid.length;
        int rows = grid[0].length;
        int row = 0;
        int column = 0;
        int secondDiagonal = 0;
        List<Integer> diagonals = new ArrayList<>();
        for (; column < columns; column++) {
            for (; row < rows; row++) {
                secondDiagonal = grid[row][columns - 1 - row];
                System.out.println(secondDiagonal);
                diagonals.add(secondDiagonal);
            }
        }
        return Arrays.asList(Collections.min(diagonals), Collections.max(diagonals));
    }
    public static Integer findRowWithTarget(int[][] matrix, int target) {
        int rows = matrix[0].length-1;
        int cols = matrix.length-1;
        int counter = 0;
        int row = 0;
        int col = 0;
        for (;  col<cols ; col++) {
            for (; row < rows; row++) {
                if (matrix[row][col] == target) {
                    return row;
                } else {
                    return null;
                }
            }
        }

        return row;
    }

    public static void main(String[] args) {
        int[][] seatingChart = {
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304}
        };

        int[][] matrix = {
                {6, 7, 8},
                {4, 6, 7},
                {1, 4, 6}};

        int[][] matrix2 = {{1, 2, 3, 4}, {2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7}};

        int [][] matrix3 =  {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}};

        // TODO: Store the result of transformMatrix in transposedSeating and print it
        //  System.out.println(Arrays.deepToString(transformMatrix(seatingChart)));
        // System.out.println(isToeplitzMatrix(matrix));
        //  System.out.println(countLessThan(matrix2,5));
     //   System.out.println(solution(matrix));
        System.out.println(findRowWithTarget(matrix3, 5));

    }
}
