package dsa_assignments_kunal.sept23;
import java.util.*;
public class LuckyNumber {


    public static void main(String[] args) {

        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};

        List<Integer> luckyNumbers = LuckyNumber.luckyNumbers(matrix);
        System.out.println(luckyNumbers);

    }

        public static List<Integer> luckyNumbers(int[][] matrix) {
            List<Integer> luckyNumbers = new ArrayList<>();

            // Step 1: Find minimum in each row and store minimum value and its column index
            int m = matrix.length;
            int n = matrix[0].length;
            int[] minInRows = new int[m];
            int[] columnIndices = new int[m]; // Column indices corresponding to minimums in each row

            for (int i = 0; i < m; i++) {
                int min = Integer.MAX_VALUE;
                int columnIndex = -1;
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                        columnIndex = j;
                    }
                }
                minInRows[i] = min;
                columnIndices[i] = columnIndex;
            }

            // Step 2: Check if the minimum in each row is the maximum in its column
            for (int i = 0; i < m; i++) {
                int rowIndex = i;
                int columnIndex = columnIndices[i];
                int candidate = matrix[rowIndex][columnIndex];

                // Check if candidate is the maximum in its column
                boolean isMaxInColumn = true;
                for (int k = 0; k < m; k++) {
                    if (matrix[k][columnIndex] > candidate) {
                        isMaxInColumn = false;
                        break;
                    }
                }

                if (isMaxInColumn) {
                    luckyNumbers.add(candidate);
                }
            }

            return luckyNumbers;
        }
    }
