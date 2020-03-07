/**
 * Question
 *
 * https://leetcode.com/problems/power-of-three/
 */

 class PowerOfThree {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 27;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));
        
        n = 0;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 9;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 45;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 103;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 243;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        // if < 1 we went too far
        if (n < 1)
            return false;

        // if % 3 == 0 then it's divisible by 3 therefore potentially a power of 
        while (n % 3 == 0)
            // divide by 3 until we know it's not a power or is equal to 1
            n /= 3;

        // if == 1 then it is a power of 3!
        return n == 1;
    }
 }
