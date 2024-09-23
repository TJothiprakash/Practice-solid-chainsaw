package dsa_assignments_kunal.sept23;

/*Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]


Constraints:

1 <= n <= 1000
*/import java.util.*;
public class UniqueIntegerSum {
    public static void main(String[] args) {

        int n = 12;

        int[] ans = new UniqueIntegerSum().sumZero(n);

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.stream(ans).sum());
    }


        public int[] sumZero(int n) {
            int[] sumArr = new int[n];
            int num = 1;
            for(int i=0; i<n; i++){
                if(n%2==1 && i==n-1){
                    sumArr[n-1] = 0;
                    break;
                }
                sumArr[i++] = -1*(num);
                sumArr[i] = num++;
            }
            return sumArr;
        }
        /* int[] ans = new int[n];
        Set<Integer> uniqueNumbers = new HashSet<>(); // To track unique numbers

        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                int randNum;
                do {
                    randNum = (int) (Math.random() * 100);
                } while (uniqueNumbers.contains(randNum)); // Ensure uniqueness
                uniqueNumbers.add(randNum); // Add to set
                ans[i] = randNum; // Assign the random number
                ans[i + 1] = -randNum; // Assign its negative
            }
        } else {
            ans[0] = 0; // First element is 0 for odd n
            uniqueNumbers.add(0); // Add 0 to the set
            for (int i = 1; i < n; i += 2) {
                int randNum;
                do {
                    randNum = (int) (Math.random() * 100);
                } while (uniqueNumbers.contains(randNum)); // Ensure uniqueness
                uniqueNumbers.add(randNum); // Add to set
                ans[i] = randNum; // Assign the random number
                ans[i + 1] = -randNum; // Assign its negative
            }
        }
        return ans;*/


}
