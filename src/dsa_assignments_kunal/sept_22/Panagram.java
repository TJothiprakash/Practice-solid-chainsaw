package dsa_assignments_kunal.sept_22;

import java.util.Locale;

/*A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.



Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false


Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
*/
public class Panagram {
    public static void main(String[] args) {
        String check ="JGDKSBGOGOJKDdgsg";
        System.out.println(new Panagram().checkIfPangram(check.toLowerCase()));

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(new Panagram().checkIfPangram(sentence.toLowerCase()));


    }

    // Function to check if a string is a pangram.
    public boolean checkIfPangram(String sentence) {

        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {

            arr[sentence.charAt(i) - 'a'] = true;

        }

        for (int i = 0; i < 26; i++) {

            if (arr[i] == false) {

                return false;
            }
        }

        return true;
    }
}
