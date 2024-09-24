package dsa_assignments_kunal.sept_24;

import java.util.Arrays;

/*Given an integer array nums, find three numbers whose product is maximum and return the maximum product.



Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6


Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000*/
public class MaxProductofThreeNumbers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(new MaxProductofThreeNumbers().maximumProduct(nums));
        int []nums1 ={-1,-2,-3};
        System.out.println(new MaxProductofThreeNumbers().maximumProduct(nums1));
    }
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
    }
}
/*class Solution {
    public int maximumProduct(int[] nums) {
        int maxp1 = Integer.MIN_VALUE, maxp2 = Integer.MIN_VALUE, maxp3 = Integer.MIN_VALUE;
        int minp1 = Integer.MAX_VALUE, minp2 = Integer.MAX_VALUE;
        for (int ele : nums) {
            if(maxp1<=ele){
                maxp3=maxp2;
                maxp2=maxp1;
                maxp1=ele;
            }
            if(maxp2<=ele && ele<maxp1){
                maxp3=maxp2;
                maxp2=ele;
            }
            if(maxp3<=ele && ele<maxp2){
                maxp3=ele;
            }
            if(minp1>=ele){
                minp2=minp1;
                minp1=ele;
            }
            if(minp2>=ele && ele>minp1){
                minp2=ele;
            }
        }
        return Math.max(maxp1 * maxp2 * maxp3, minp1 * minp2 * maxp1);
    }
}*/