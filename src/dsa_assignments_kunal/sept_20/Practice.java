package dsa_assignments_kunal.sept_20;


import java.util.Scanner;

/*Area Of Circle Java Program
Area Of Triangle
Area Of Rectangle Program
Area Of Isosceles Triangle
Area Of Parallelogram
Area Of Rhombus*/
public class Practice {

    public static void main(String[] args) {

        Practice p = new Practice();
        /*System.out.println(p.triangleArea(5, 7));
        System.out.println(p.circle(5));
        System.out.println(p.rectangle(5, 7));
        System.out.println(p.rhombus(5, 7));
        System.out.println("Perimeter of circle is : " + p.permimeterofcircle(5));
        System.out.println();
        System.out.println("Perimeter of rectangle is : " + p.perimeterofrectangle(5, 7));
        System.out.println();*/
      /*  long [] arr = fibanacciSeries(17);
        for (long a:arr
             ) {
            System.out.print( a +" ");
        }*/
        //System.out.println(p.subOfProdAndSumOfDigits(1));
      /*  int[] ans = p.printAllFactors(32);
        for (int f : ans
        ) {
            if(f>0) System.out.print(f + " ");
        }
*/
        System.out.println(p.printsum());
    }

    public static long[] fibanacciSeries(int n) {
        long[] arr = new long[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public float triangleArea(int base, int height) {
        return (float) (.5 * (base * height));
    }

    public float rectangle(int length, int breadth) {
        return (float) (length * breadth);

    }

    public float circle(int radius) {
        return (float) Math.PI * radius * radius;
    }

    public float rhombus(int diagonal1, int diagonal2) {

        return (float) ((diagonal1 * diagonal2) / 2);

    }

    public float equilateralTriangle(int side) {

        return (float) (Math.sqrt(3) * (side * side)) / 4;
    }

    //// perimeter's of shapes
    public float permimeterofcircle(int radius) {

        return (float) (2 * Math.PI * radius);
    }

    public float perimeterofrectangle(int length, int breadth) {
        return (float) 2 * (length + breadth);


    }

    /*
Area Of Equilateral Triangle
Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
Perimeter Of Rectangle
Perimeter Of Square
Perimeter Of Rhombus
Volume Of Cone Java Program*/
    public float perimeterOfSquare(int side) {
        return (float) 4 * side;
    }

    private float volumeofcone(int radius, int height) {
        return (float) ((1 / 3) * Math.PI * (radius * radius * height));
    }

    protected float volumeOfPrism(int length, int width, int height) {
        return (float) (length * width * height);
    }

    protected float volumeOfCylinder(int radius, int height) {
        return (float) (Math.PI * radius * radius * height);
    }

    protected float volumeOfSphere(int radius) {
        return (float) (4 / 3 * Math.PI * radius * radius * radius);
    }

    public float volumeOfSquarePyramid(int base, int height) {
        return (float) (base * base * height);
    }

    public float volumeOfCube(int side) {
        return (float) (Math.pow(side, 3));
    }

    public float subOfProdAndSumOfDigits(int number) {
        int sum = 0;
        int prod = 1;
        while (number > 0) {
            int rem = number % 10;
            sum += rem;
            prod *= rem;
            number = number / 10;
        }
        return prod - sum;
    }

    public int[] printAllFactors(int number) {
        int[] arr = new int[number];
        int i = 0;
        for (int n = 1; n <= number; n++) {

            if (number % n == 0) {
                arr[i] = n;
                i++;
                System.out.println(n);
            }
        }
        return arr;
    }

        public static int printsum() {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            int num;
            int largest = Integer.MIN_VALUE;
            // Take inputs until the user enters 0
            while (true) {
                System.out.print("Enter a number (0 to stop): ");
                num = sc.nextInt();
                System.out.println("you have entered " + num);
                if(num > largest) largest = num;
                // If the input is 0, break out of the loop
                if (num == 0) {
                    break;
                }

                // Add the number to the sum
                sum += num;
            }

            // Print the total sum
            System.out.println("Total Sum: " + sum);
            System.out.println("Largest num is " + largest);
            return sum;
    }

    /*Curved Surface Area Of Cylinder
Total Surface Area Of Cube
Fibonacci Series In Java Programs
Subtract the Product and Sum of Digits of an Integer
Input a number and print all the factors of that number (use loops).
Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
Take integer inputs till the user enters 0 and print the largest number from all.
Addition Of Two Numbers*/
}



/*
Volume Of Prism
Volume Of Cylinder
Volume Of Sphere
Volume Of Pyramid
//
//

Intermediate Java Programs
Factorial Program In Java
Calculate Electricity Bill
Calculate Average Of N Numbers
Calculate Discount Of Product
Calculate Distance Between Two Points
Calculate Commission Percentage
Power In Java
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
LCM Of Two Numbers
Java Program Vowel Or Consonant
Perfect Number In Java
Check Leap Year Or Not
Sum Of A Digits Of Number
Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
DSA-Bootcamp-Java/assignments/03-conditionals-loops.md at main · kunal-kushwaha/DSA-Bootcamp-Java*/



