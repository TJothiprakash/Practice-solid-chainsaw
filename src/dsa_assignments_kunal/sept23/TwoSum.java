package dsa_assignments_kunal.sept23;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

i
Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?*/
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
            int nums[] = {2, 7, 11, 15};
            int target = 9;

            System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));

    }

    // Brute Force Approach
    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
/*    public int[] twoSum(int[] nums, int target) {
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the pair is equal to the target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // Return an empty array if no pair is found
        return new int[0];
    }*/
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the indices of elements we have seen so far.
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap.
            if (numToIndex.containsKey(complement)) {
                // Return the indices of the two elements that add up to the target.
                return new int[] {numToIndex.get(complement), i};
            }

            // Add the current element and its index to the HashMap.
            numToIndex.put(nums[i], i);
        }

        // If no solution is found, return an array with default values.
        return new int[] {-1, -1};
    }

}
