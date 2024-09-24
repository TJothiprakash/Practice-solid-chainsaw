package dsa_assignments_kunal.sept_24;

import java.util.Map;

/*y
Math - Easy problems
Roman to Integer.
Happy Number.
Armstrong Numbers
Power of Four
Factorial
Excel Sheet Column Title
Maximum Product of Three Numbers
Climbing Stairs
Self Dividing Numbers
Add Binary
Power of Two*/
public class Mathio {
    public static void main(String[] args) {

       /* String s = "VI";

        System.out.println(new Mathio().romanToInt(s));
        int n = 14;
        int n1=7;
        System.out.println(isHappy(n));
        System.out.println(isHappy(n1));
*//*
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));*/

        int n = 5;
        System.out.println(new Mathio().isPowerOfTwo(n));
        int n1=32;
        System.out.println(new Mathio().isPowerOfTwo(n1));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sqr(slow);
            fast = sqr(sqr(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int sqr(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    public static boolean isPowerOfFour(int n) {

        if (n == 1) {
            return true;
        }
        if (n % 4 != 0) {
            return false;
        }
        return isPowerOfFour(n / 4);
    }

    public int romanToInt(String s) {
        // iterate string from left to right and add all the values
        Map<Character, Integer> roman = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                sum -= roman.get(s.charAt(i));
            } else {
                sum += roman.get(s.charAt(i));
            }
        }
        return sum;
    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
    /*public class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < 31; i++) {
            int ans = (int) Math.pow(2, i);
            if (ans == n) {
                return true;
            }
        }
        return false;
    }
}*/
}

