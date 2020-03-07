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
        if (n == 1)
            return true;
        for (int i = 3; i <= n; i*=3)
            if (i == n)
                return true;
        return false;
    }
 }
