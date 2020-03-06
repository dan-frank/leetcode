// QUESTION
// Write a program that outputs the string representation of numbers from 1 to n.
// But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.



class fizzbuzz {
    public static void main(String args[]) {
        try {
            int n = Integer.parseInt(args[0]);
            System.out.println("Calculating fizzbuzz for " + n + " values...\n");

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0)
                    System.out.print("Fizz");
                if (i % 5 == 0)
                    System.out.print("Buzz");
                if (i % 3 != 0 && i % 5 != 0)
                    System.out.print(i);
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("You didn't input an int...");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You didn't input anything...");
        }
    }
}
