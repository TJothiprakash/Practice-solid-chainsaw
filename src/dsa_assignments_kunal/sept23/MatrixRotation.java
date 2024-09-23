package dsa_assignments_kunal.sept23;
/*Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target by rotating mat in 90-degree increments, or false otherwise.
Example 1:
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
Example 2:
Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
Output: false
Explanation: It is impossible to make mat equal to target by rotating mat.
Example 3:
Input: mat = [[0,0,0],[0,1,0],[1,1,1]], target = [[1,1,1],[0,1,0],[0,0,0]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise two times to make mat equal target.
Constraints:
n == mat.length == target.length
n == mat[i].length == target[i].length
1 <= n <= 10
mat[i][j] and target[i][j] are either 0 or 1.*/


public class MatrixRotation {

    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] mat1 = {{1, 0}, {0, 1}};
        int[][] mat2 = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};

        int[][] target = {{1, 0}, {0, 1}};
        int[][] target1 = {{1, 0}, {0, 1}};
        int[][] target2 = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};

        System.out.println(new MatrixRotation().findRotation(mat, target));    // true
        System.out.println(new MatrixRotation().findRotation(mat1, target1));  // true
        System.out.println(new MatrixRotation().findRotation(mat2, target2));  // true
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    // Rotate the matrix 90 degrees clockwise
    private int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    // Check if two matrices are equal
    private boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        int n = mat1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
