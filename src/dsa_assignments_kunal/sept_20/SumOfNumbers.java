package dsa_assignments_kunal.sept_20;
import java.util.Scanner;
import java.util.logging.Logger;

public class SumOfNumbers {

    private static final Logger logger = Logger.getLogger(SumOfNumbers.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        while (true) {
            logger.info("Enter a number (0 to stop): ");
            int num = scanner.nextInt();

            // Terminate the loop when the user enters 0
            if (num == 0) {
                break;
            }

            // Calculate the sum of negative numbers
            if (num < 0) {
                sumNegative += num;
            }
            // Calculate the sum of positive even numbers
            else if (num > 0 && num % 2 == 0) {
                sumPositiveEven += num;
            }
            // Calculate the sum of positive odd numbers
            else if (num > 0 && num % 2 != 0) {
                sumPositiveOdd += num;
            }
        }

        // Log the final results
        logger.info("Sum of negative numbers: " + sumNegative);
        logger.info("Sum of positive even numbers: " + sumPositiveEven);
        logger.info("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
