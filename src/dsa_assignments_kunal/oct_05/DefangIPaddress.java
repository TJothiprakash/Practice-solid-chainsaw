package dsa_assignments_kunal.oct_05;

/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".



Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"


Constraints:

The given address is a valid IPv4 address.*/

public class DefangIPaddress {

    public static void main(String[] args) {

        String address = "10.1.97.255.90078";
        System.out.println(new DefangIPaddress().defangIPaddr(address));

    }

            public static boolean checklength(String address){
                if (address.length() <= 15) {
                    return true;
                }
                return false;
            }
    public boolean validIP(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        int partCount = 0; // to count number of parts in IP address

        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);

            if (ch != '.') {
                stringBuilder.append(ch);
            } else {
                // Convert the current part to integer
                if (!processPart(stringBuilder)) {
                    return false;
                }
                // Reset stringBuilder for the next part
                stringBuilder.setLength(0);
                partCount++;
            }
        }

        // Process the last part of the IP address (after the final dot)
        if (!processPart(stringBuilder)) {
            return false;
        }

        // Ensure there are exactly 3 dots (4 parts in total for a valid IPv4)
        return partCount == 3;
    }

    // Helper method to process each part of the IP address
    private boolean processPart(StringBuilder part) {
        try {
            int num = Integer.parseInt(part.toString());
            // Check if the part is within the valid range (0-255)
            return num >= 0 && num <= 255;
        } catch (NumberFormatException e) {
            return false; // If parseInt fails
        }
    }



    public String defangIPaddr(String address) {

        if(!checklength(address)){
            return "ip is not valid, lenth should be less than or equal to 15";
        }
        if(!validIP(address)){
            return "ip is not valid";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
