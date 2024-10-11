package dsa_assignments_kunal.oct_11;

///* *
//         * *
//        *   *
//       *     *
//      **********/
// pattern 13
public class Test {
    public static void main(String[] args) {
        //printpattern13(5); // 'n' refers to the number of lines
        reverseprintpattern13(5);
    }

    public static void printpattern13(int n) {
        // Outer loop for the rows
        for (int i = 1; i <= n; i++) {

            // Print spaces or stars between the two stars
            if (i == 1) {
                // In the first row, there's only one star on the left side
                System.out.println();
            } else if (i == n) {
                // In the last row, print a continuous row of stars
                for (int j = 1; j <= (2 * i - 2); j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // For other rows, print spaces between the stars
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                // Print the second star
                System.out.println("*");
            }
        }
    }


    public static void reverseprintpattern13(int n) {
        // Original pattern (upper part)
        for (int i = 1; i <= n; i++) {

            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print the first star
            System.out.print("*");

            // Print spaces or stars between the two stars
            if (i == 1) {
                // In the first row, there's only one star on the left side
                System.out.println();
            } else if (i == n) {
                // In the last row, print a continuous row of stars
                for (int j = 1; j <= (2 * i - 2); j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                // For other rows, print spaces between the stars
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                // Print the second star
                System.out.println("*");
            }
        }

        // Reverse pattern (lower part - upside down)
        for (int i = n - 1; i >= 1; i--) {

            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print the first star
            System.out.print("*");

            // Print spaces or stars between the two stars
            if (i == 1) {
                // In the last row of the inverted pattern, only one star
                System.out.println();
            } else {
                // Print spaces between the stars
                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                // Print the second star
                System.out.println("*");
            }
        }
    }
}
