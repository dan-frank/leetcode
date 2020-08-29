import java.util.Arrays;

class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] nums2 = {1,3,12,3,5};
        moveZeroes(nums);
        moveZeroes(nums2);
    }

    public static void moveZeroes(int[] nums) {
        // Count zeroes - zero counter
        // Trim all zeroes - amount to move position
        // Add zeroes to the end of array

        int zeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else {
                nums[i - zeroes] = nums[i];
            }
        }

        while (zeroes > 0) {
            nums[nums.length - zeroes] = 0;
            zeroes--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
