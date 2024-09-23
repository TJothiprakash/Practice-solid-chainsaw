package dsa_assignments_kunal.sept23;

import java.util.Arrays;

/*pGiven a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]


Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109*/
public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] ans= new TransposeMatrix().transpose(matrix);
        for (int i = 0; i < ans.length; i++) {

            System.out.println(Arrays.toString(ans[i]));
        }
        int[][] matrix1 = {{1,2,3},{4,5,6}};
        System.out.println(new TransposeMatrix().transpose(matrix1));
    }
    public int[][] transpose(int[][] matrix) {
        int ans[][]=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}
