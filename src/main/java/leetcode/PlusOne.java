package leetcode;

/*
    66. Plus One

    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer. The digits are 
    ordered from most significant to least significant in left-to-right order. 
    The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.

    Constraints:
    - 1 <= digits.length <= 100
    - 0 <= digits[i] <= 9
    - digits does not contain any leading 0's.


*/

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        boolean isNine = false;

        for (int i = digits.length - 1; i >= 0; i--) {
            // Case 1: Current number is 9, set to 0 and report increment for following digit
            if (digits[i] == 9) {
                // if the digit is 9, set it to 0
                digits[i] = 0;
                isNine = true;
            // Case 2: Current digit is smaller than 9, so we incremented by 1 number
            } else {
                // if the digit is not 9, increment it by 1 and return the array
                digits[i]++;
                return digits;
            }

            // case 3: the first digit of the number is nine, add new entry
            if (i == 0 && isNine) {
                // Create new array of integers with length + 1
                digits = new int[digits.length + 1];

                // Set first entry of digit to 1
                digits[0] = 1;

                return digits;
            }
        }
        return digits;
    }


    public static void main(String[] args) {
        int[] digits = {1, 0, 9, 1, 9};

        digits = plusOne(digits);

        System.out.print("Solution: " + digits[0]);
        for (int i = 1; i < digits.length; i++) {
            System.out.print(", " + digits[i]);
        }

        System.out.println("");
    }
}
