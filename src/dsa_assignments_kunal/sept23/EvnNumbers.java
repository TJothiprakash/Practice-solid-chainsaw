package dsa_assignments_kunal.sept23;

/*Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.


Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 105
*/
public class EvnNumbers {
    public static void main(String[] args) {
        int[] nums = {345, 2, 6, 7896};
        System.out.println(new EvnNumbers().findNumbers(nums));
        int[] nums1 = {12, 12, 12, 21, 21, 1234};
        System.out.println(new EvnNumbers().findNumbers(nums1));
    }

    public int findNumbers(int[] nums) {
        int evennumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int num = nums[i]; // Store nums[i] in a separate variable to avoid modifying nums[i]

            // Count digits in num
            while (num > 0) {
                num = num / 10;
                count++;
            }

            // Check if count of digits is even
            if (count % 2 == 0) {
                evennumbers++;
            }
        }

        return evennumbers;
    }

}
