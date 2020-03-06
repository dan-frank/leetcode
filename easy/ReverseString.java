/**
 * Question
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 */

import java.util.Arrays;

class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int length = s.length - 1;

        for (int i = 0; i < s.length && i < length; i++) {
            char temp = s[i];
            s[i] = s[length];
            s[length] = temp;
            length--;
        }

        System.out.println(Arrays.toString(s));
    }
}
