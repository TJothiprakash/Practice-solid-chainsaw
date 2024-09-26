package dsa_assignments_kunal.sept_26;

public class Patterns6_10 {
    public static void main(String[] args) {

        printPattern();
    }

    public static void printPattern() {

        /*
         *****
         ****
         ***
         **
         **/
        int n = 5;
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                if (j >= n) {
                    System.out.print("*");
                    n--;
                } else {
                    System.out.print(" ");
                }

            }  System.out.println();
        }
    }
}
