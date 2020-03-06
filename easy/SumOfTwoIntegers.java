// QUESTION
// Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -

class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(1, 10));
    }

    // Stolen Solution
    // This uses bitwise operations 
    // & and ^ and <<
    // I don't understand...
    public static int getSum(int a, int b) {
        while(b != 0){
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }

        return a;
    }
}
