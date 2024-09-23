package dsa_assignments_kunal.sept_20;

import java.util.Scanner;

/*
Intermediate Java Programs
Factorial Program In Java
DSA-Bootcamp-Java/assignments/03-conditionals-loops.md at main · kunal-kushwaha/DSA-Bootcamp-Java*/
public class Practice2 {

    public static void main(String[] args) {
       /* System.out.println(factorial(5));
        System.out.println("Electricty bil for 265 uints is "+calculateElectricityBill(265));
        System.out.println("Electricty bil for 150 uints is "+calculateElectricityBill(150));
        System.out.println("Electricty bil for 89 uints is "+calculateElectricityBill(89));
*/
        //System.out.println("Avereage is "+averageofNnumbers());

        //System.out.println("Power of 2 to 4 is "+   power(2,4));
        System.out.println("The depreciation value of a bike 50000 is after 8 years at 10% rate is "+  depreciationofvalue(50000,8,10));
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

     static double calculateElectricityBill(int units) {
        double bill = 0.0;
        if (units <= 50) {
          bill = units * 0.50;
        } else if (units <= 150) {
          bill = 25 + (units - 50) * 0.75;
        } else if (units <= 250) {
          bill = 100 + (units - 150) * 1.20;
        } else {
          bill = 220 + (units - 250) * 1.50;
        }
        return bill;
      }
      static float averageofNnumbers(){
        float sum = 0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of elements : ");
          int n = sc.nextInt();
          System.out.println("Enter the elements : ");
          for (int i = 0; i < n; i++) {
            sum += sc.nextFloat();
          }
          return sum / n;
      }

     static float discountofproduct (float price, float discount){
        return price - (price * discount / 100);
     }
        static  float  distancebetweenpoints(float x1, float y1, float x2, float y2){
            return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
        static float commissionpercentage(float sales, float commission){
            return (sales * commission) / 100;
        }
        static float power(float base, float exponent){
            return (float) Math.pow(base, exponent);
        }
    /*
Calculate Electricity Bill
Calculate Average Of N Numbers
Calculate Discount Of Product
Calculate Distance Between Two Points
Calculate Commission Percentage
Power In Java*/



    /*
Calculate Depreciation of Value
Calculate Batting Average
Calculate CGPA Java Program
Compound Interest Java Program
Calculate Average Marks
Sum Of N Numbers
Armstrong Number In Java
Find Ncr & Npr
Reverse A String In Java
Find if a number is palindrome or not
Future Investment Value
HCF Of Two Numbers Program
LCM Of Two Numbers*/
    static float depreciationofvalue(float value, float years, int depreciationRate){
        for(int i = 0; i < years; i++){
            value = value - (value * (depreciationRate / 100.0f));
            System.out.println("value after year "+(i+1)+" is "+value);
        }
        return value;
    }

    static  float ncr(int n, int r){
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    static  float npr(int n, int r){
        return factorial(n) / factorial(n - r);
    }

    static String reverseString(String str){
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--){
            rev += str.charAt(i);
        }
        return rev;
    }

    static int hcf(int a, int b){
        if(b == 0){
            return a;
        }
        return hcf(b, a % b);
    }

    static int lcm(int a, int b){
        return (a * b) / hcf(a, b);
    }

    /*
Java Program Vowel Or Consonant
Perfect Number In Java
Check Leap Year Or Not
Sum Of A Digits Of Number
Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
*/

    static String vowelorconsonant(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return "vowel";
        }
        return "consonant";

    }

    static int perfectnumber(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;

            }

        }
        return sum == n ? 1 : 0;
    }

    static boolean leapyear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
