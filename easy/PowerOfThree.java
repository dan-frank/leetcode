/**
 * Question
 *
 * https://leetcode.com/problems/power-of-three/
 */

 class PowerOfThree {
    public static void main(String[] args) {
        int n = 27;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));
        
        n = 0;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 9;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 45;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));

        n = 103;
        System.out.println("" + n + " is a power of three: " + isPowerOfThree(n));
    }

    public static boolean isPowerOfThree(int n) {
        return n % 3 == 0;
    }
 }
