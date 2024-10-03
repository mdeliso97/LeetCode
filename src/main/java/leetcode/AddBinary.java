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
        int aInt = 0;
        int bInt = 0;

        // test boundary conditions
        if (a == "0")
            return b;

        if (b == "0")
            return a;

        // add two binary strings
        int maxLength = Math.max(a.length(), b.length());

        // increment the current value only if the index is less than the length of the string
        for (int i = 0; i < maxLength; i++) {
            if (i <= a.length() - 1 && Character.getNumericValue(a.charAt(i)) != 0) 
                aInt += Math.pow(2, a.length() - i - 1);
            
            // increment the current value only if the index is less than the length of the string
            if (i <= b.length() - 1 && Character.getNumericValue(b.charAt(i)) != 0)
                bInt += Math.pow(2, b.length() - i - 1);  
        }

        aInt = Math.abs(aInt + bInt);
        a = "";

        while (aInt != 0) {
            // Checks whether odd number
            if (aInt % 2 != 0) {
                a = "1" + a;
                aInt = (aInt - 1) / 2;

            } else {
                a = "0" + a;
                aInt /= 2;
            }
        }
        //a = "1" + a;
        return a;
    }
    
    public static void main(String[] args) {
        String binary0 = "0";
        String binary1 = "0";


        String binaryStr = addBinary(binary0, binary1);

        System.out.println("Solution: " + binaryStr);
    }
}
