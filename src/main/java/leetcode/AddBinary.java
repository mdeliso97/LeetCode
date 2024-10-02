package leetcode;

/*
    67. Add Binary

    Given two binary strings a and b, return their sum as a binary string.

    Example 1:
    Input: a = "11", b = "1"
    Output: "100"

    Example 2:
    Input: a = "1010", b = "1011"
    Output: "10101"

    Constraints:    
    - 1 <= a.length, b.length <= 104
    - a and b consist only of '0' or '1' characters.
    - Each string does not contain leading zeros except for the zero itself.
*/

public class AddBinary {
    public static String addBinary(String a, String b) {
        String strCurrent = "";
        String output = "";
        boolean isOne = false;

        // Select biggest binary number, keep b as smallest string
        if (a.length() >= b.length()) {
            strCurrent = a;
        } else {
            strCurrent = b;
            b = a;

            // Add leading zeros to b string to have same length string
            while (b.length() < strCurrent.length()) {
                b = "0" + b;
            }
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            // filter for one
            if (b.charAt(i) == '1') {
                if (strCurrent.charAt(i) == '0') {
                    output = "1" + output;
                    isOne = false;
                } else {
                    output = "0" + output;
                    isOne = true;
                }
            
            // The current character in b string is not 1, we can proceed 
            } else {
                output = strCurrent.charAt(i) + output;
                continue;
            }
        }

        if (isOne) {
            output = "1" + output;
        }

        return output;
    }
    
    public static void main(String[] args) {
        String binary0 = "1101";
        String binary1 = "11011";


        String binaryStr = addBinary(binary0, binary1);

        System.out.println("Solution: " + binaryStr);
    }
}
