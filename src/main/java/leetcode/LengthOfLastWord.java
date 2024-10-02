package leetcode;

/*
    58. Length of Last Word

    Given a string s consisting of words and spaces, return the length of the last word in the string.
    A word is a maximal substring consisting of non-space characters only.

    Constriants:
    - 1 <= s.length <= 104
    - s consists of only English letters and spaces ' '.
    - There will be at least one word in s.

    return the length of the last word in the string s.

*/

public class LengthOfLastWord {
    public static int searchInsert(String s) {
        String output = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (output.length() > 0) {
                    return output.length();
                } else {
                    continue;
                }
                
            } else {
                output += s.charAt(i);
            }
        }

        return output.length();
    }


    public static void main(String[] args) {
        String s = "luffy is still joyboy";

        System.out.println("Solution:" + searchInsert(s));
    }
}
