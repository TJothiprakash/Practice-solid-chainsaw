package dsa_assignments_kunal.sept_22;


/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]


Constraints:

1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.


Follow-up: Can you solve it without using an extra space (i.e., O(1) memory)?

*/
public class ArrayPermutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.print("before : ");
        for (int nums1 : nums) {

            System.out.print(nums1 + " ");
        }
        System.out.println();
        System.out.print("after :  ");
        int[] ans = buildArray(nums);
        for (int a : ans) {

            System.out.print(a + " ");
        }

    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
int count=0;
        // Iterate over the array and place elements at their correct positions
        for (int i = 0; i < n; i++) {
            // Continue swapping until nums[i] is placed in the correct position
            while (nums[i] != i) {
                // Swap nums[i] with nums[nums[i]] to place nums[i] in the correct spot
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
                System.out.println("Count :"+count++);
            }
        }

        return nums;
    }
}

