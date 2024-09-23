package dsa_assignments_kunal.sept_21;

/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

Define a program to find out whether a given number is even or odd.

A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

Write a program to print the sum of two numbers entered by user by defining your own method.

Define a method that returns the product of two numbers entered by user.

Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

Define a method to find out if a number is prime or not.

Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:


Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
Write a function to find if a number is a palindrome or not. Take number as parameter.

Convert the programs in flow of program, first java, conditionals & loops assignments into functions.

Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

Write a function that returns all prime numbers between two given numbers.

Write a function that returns the sum of first n natural numbers.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {
/*
        System.out.println("Max no of three numbers is : "+new Practice().max(7,2,3));
        System.out.println("Min no of three numbers is : "+new Practice().min(7,2,3));
*/

        //System.out.println("Eligibility check age is 17 : "+new Practice().checkEligibility(17));
      /*  System.out.println();
        System.out.println("Sum of two numbers : "+new Practice().sum());
*/
        // new Practice().circleProps();

        /*isPrime(23);
        System.out.println("29 is a prime number : "+isPrime(29));
        System.out.println("23 is a prime number : "+isPrime(23));
        System.out.println("31 si a prime number : "+isPrime(31));

        System.out.println("33 is a prime number : "+isPrime(33));*/


        //System.out.println(getGrade());
      /*  printFactorial(0);
        printFactorial(8);
        printFactorial(4);*/
       /* System.out.println(isPalindrome(131));
        System.out.println(isPalindrome(3253253));*/
        /*System.out.println(sumOfNNumbers(5));
        System.out.println(sumOfNNumbers(54));
*/

       /* ArrayList<Integer>  arr = new Practice().prinmeBWRange(1, 100);
        for (int i : arr) {
            System.out.print(i + " ");
        }*/
        System.out.println("is 3,4,5 a pythagorean triplet : " + new Practice().isPythagoreanTriplet(3, 4, 5));
        System.out.println("is 3,4,6 a pythagorean triplet : " + new Practice().isPythagoreanTriplet(3, 4, 6));
        System.out.println("is 3,5,6 a pythagorean triplet : " + new Practice().isPythagoreanTriplet(3, 5, 6));
        System.out.println("is 4,5,6 a pythagorean triplet : " + new Practice().isPythagoreanTriplet(4, 5, 6));
        System.out.println("is 4,5,7 a pythagorean triplet : " + new Practice().isPythagoreanTriplet(4, 5, 7));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static String getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grading Sheet : \n" + "Marks        Grade\n" + "91-100         AA\n" + "81-90          AB\n" + "71-80          BB\n" + "61-70          BC\n" + "51-60          CD\n" + "41-50          DD\n" + "<=40          Fail\n");
        System.out.println("Enter marks out of 100 : ");
        System.out.print("Enter your marks : ");
        int marks = scanner.nextInt();
        scanner.close();
        if (marks > 90) return "AA";
        else if (marks > 80) return "AB";
        else if (marks > 70) return "BB";
        else if (marks > 60) return "BC";
        else if (marks > 50) return "CD";
        else if (marks > 40) return "DD";
        else return "Fail";
    }

    public static void printFactorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println("factorial of " + n + " is : " + fact);
            return;
        }
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + n + " is : " + fact);
    }

    public static boolean isPalindrome(int num) {

        String number = String.valueOf(num);

        System.out.println(number.getClass());
        int length = number.length();
        for (int i = 0; i < length / 2; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1)) return false;
        }
        return true;
    }

    public static int sumOfNNumbers(int n) {
        /*int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;*/
        return (n * (n + 1)) / 2;
    }

    public int max(int a, int b, int c) {
        return a > b && a > c ? a : b > c ? b : c;
    }

    public int min(int a, int b, int c) {
        return a < b && a < c ? a : b < c ? b : c;
    }

    public boolean checkEligibility(int age) {
        return age >= 18;
    }

    public int sum() {
        System.out.print("Enter two numbers : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = new Practice().product(a, b);
        System.out.println("Product of two numbers : " + product);
        scanner.close();
        return a + b;
    }

    /*
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/

    public int product(int a, int b) {
        return a * b;
    }

    public int circleProps() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int radius = scanner.nextInt();
        System.out.println("Circumference of circle : " + new Practice().circleCircumference(radius));
        System.out.println("Area of circle : " + new Practice().circleArea(radius));
        scanner.close();
        return 0;
    }

    private String circleArea(int radius) {
        return "Area of circle : " + String.format("%.3f", (Math.PI * radius * radius));
    }

    private String circleCircumference(int radius) {
        return "Circumference of circle : " + 2 * Math.PI * radius;
    }

    public ArrayList<Integer> prinmeBWRange(int a, int b) {
        ArrayList<Integer> arr = new ArrayList<>();
        int j = 0;
        for (int i = a; i <= b; i++) {
            boolean status = isPrime(i);
            if (status) {
                arr.add(i);
                j++;
            }
        }
        return arr;
    }

    /*
    Write a function to check if a given triplet is a Pythagorean triplet or not.
    (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
    */
    public boolean isPythagoreanTriplet(int a, int b, int c) {
        return (a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a);
    }

}

