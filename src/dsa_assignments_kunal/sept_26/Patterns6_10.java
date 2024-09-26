package dsa_assignments_kunal.sept_26;

public class Patterns6_10 {
    public static void main(String[] args) {

        //printPattern();
       // printTriangle();
        //printInvertedTriangle();
        printInvertedTriangleofoddnumbers();
    }

    public static void printPattern() {

        /*
         *
         **
         ***
         ****
         *****

         */

        int n = 5;  // Number of rows

        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }

    }


    public  static void printTriangle(){

        int n = 5;  // Number of rows

        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }


    public static void printInvertedTriangle(){

        int n = 5;  // Number of rows

        // Loop for rows
        for (int i = n; i >= 1; i--) {
            // Loop for spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Loop for stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
    public static void printInvertedTriangleofoddnumbers(){

        int n = 11;  // Number of rows


        // Loop for rows
        for (int i = 1; i <= n; i++) {
            // Loop for printing spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Loop for printing stars (odd number of stars: 1, 3, 5, etc.)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
