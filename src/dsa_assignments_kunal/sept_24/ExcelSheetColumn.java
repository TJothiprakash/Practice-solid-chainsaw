package dsa_assignments_kunal.sept_24;

/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"


Constraints:

1 <= columnNumber <= 231 - 1*/
public class ExcelSheetColumn {
    public static void main(String[] args) {

        int n = 701;

        System.out.println(new ExcelSheetColumn().convertToTitle(n));
    }

    public String convertToTitle(int columnNumber) {


        StringBuilder str = new StringBuilder();
        while (columnNumber > 0) {
            int index = (columnNumber - 1) % 26;
            str.insert(0, (char) ('A' + index));
            columnNumber = (columnNumber - 1) / 26;
        }
        return str.toString();
    }
}



