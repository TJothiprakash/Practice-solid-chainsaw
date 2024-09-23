package dsa_assignments_kunal.sept_19;


import java.util.Scanner;

/*Write a program to print whether a number is even or odd, also take input from the user.
Take name as input and print a greeting message for that particular name.
Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
Take 2 numbers as input and print the largest number.
Input currency in rupees and output in USD.
To calculate Fibonacci Series up to n numbers.
To find out whether the given String is Palindrome or not.
To find Armstrong Number between two given number.*/
public class Practice {
    public static void main(String[] args) {
        int num = 25;

        System.out.println(isOddorEven(num));
        System.out.println(isOddorEven(14));
        String name = "Kunal";
        System.out.println(Greet(name));
       // calculateSI();
        //System.out.println( ops(40,5,'-'));
        //System.out.println(printLargest(140, 20));
        //System.out.println("USD : $"+(convertoUSD(8370)));
        //System.out.println(calculateFibanacci(89));
       // System.out.println(isPalindrome("malayalm"));
        findArmstrongBetween(1, 1420000)   ;

    }

    private static void findArmstrongBetween(int start, int end) {
        for (int j = start; j <= end; j++) {
            int number = j; // Store the original number
            int count = 0;
            int sum = 0;

            // Calculate the number of digits
            int temp = j;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            // Calculate the sum of digits raised to the power of the number of digits
            temp = j;
            while (temp > 0) {
                int digit = temp % 10; // Get the last digit
                sum += Math.pow(digit, count); // Raise the digit to the power of count and add to sum
                temp = temp / 10; // Remove the last digit
            }

            // If the sum equals the original number, it's an Armstrong number
            if (sum == number) {
                System.out.println(number + " is an Armstrong number");
            }
        }
    }

    private static boolean isPalindrome(String malayalam) {

        String rev = new StringBuffer(malayalam).reverse().toString();
        if(rev.equals(malayalam)){
            return true;
        }
        return false;
    }

    private static long calculateFibanacci(int i) {
        long first =0;
        long second = 1;
        for(int j=1;j<i;j++){
            System.out.println(first);
            long temp = first;
            first = second;
            second = temp + second;
        }
        return first;
    }

    private static float convertoUSD(int i) {
        return (float) (i/83.70);
    }

    private static int printLargest(int i, int i1) {

        return i > i1 ? i : i1;
    }

    private static void calculateSI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal");
        int principal = scanner.nextInt();
        System.out.print("Enter time in year : ");

        int time = scanner.nextInt();
        System.out.println();
        System.out.print("Enter rate of interest : ");
        int rate = scanner.nextInt();
        System.out.println();
        float si = (principal * time * rate) / 100;
        System.out.println("Simple interest is :" + si);
    }

    private static String Greet(String name) {
        return "Hello " + name;
    }

    private static boolean isOddorEven(int num) {

        return (num % 2) == 0;
    }

    public static String ops(int a, int b, char op) {

        if (op == '+') {
            return "" +(a + b);
        } else if (op == '-') {
            return a - b + "";

        } else if (op == '*') {
            return a * b + "";
        } else if (op == '/') {
            return (a / b) + "";
        } else {

            return "Invalid operator";
        }

    }
}
