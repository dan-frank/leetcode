// QUESTION
// Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

import java.util.Arrays;

class firstUniqueCharInString {
    public static void main(String args[]) {
        String s = "leetcode";
        System.out.println(firstChar(s));
        s = "aadadaad";
        System.out.println(firstChar(s));
    }

    public static int firstChar(String s) {
        char[] chars = s.toCharArray();
        
        if (chars.length == 1) {
            return 0;
        } else {
            for (int i = 0; i < chars.length; i++) {
                boolean seen = false;
                for (int j = 0; j < chars.length; j++) {
                    if (i != j) {
                        if (chars[i] == chars[j]) {
                            seen = true;
                            break;
                        }
                    }
                }
                if (!seen)
                    return i;
            }
        }
        
        return -1;
    }
}
