package dsa_assignments_kunal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayForm {
    public static void main(String[] args) {

        int[] num = {1,2,0,0};
        int k = 34;
        System.out.println(new ArrayForm().addToArrayForm(num,k));

    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = k;
        int n = num.length;

        // Process the array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            ans.add(sum % 10);  // Add the last digit to the result list
            carry = sum / 10;   // Update carry with the remaining part
        }

        // If there's any carry left, keep adding its digits
        while (carry > 0) {
            ans.add(carry % 10);
            carry /= 10;
        }

        // Reverse the result to get the correct order
        Collections.reverse(ans);

        return ans;
    }

}
