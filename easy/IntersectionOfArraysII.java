// QUESTION
// Given two arrays, write a function to compute their intersection.

import java.util.Arrays;

class IntersectionOfArraysII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int[] big = new int[1];
        int[] small = new int[1];

        if (nums1.length > nums2.length) {
            big = nums1;
            small = nums2;
        } else {
            big = nums2;
            small = nums1;
        }
        int[] intersection = new int[small.length];
        int pos = 0;

        for (int i = 0; i < big.length; i++) {
            for (int j = 0; j < small.length; j++) {
                if (big[i] == small[j]) {
                    intersection[pos] = small[j];
                    pos++;
                    small = removeItem(small, j);
                }
            }
        }

        int[] result = new int[pos];
        for (int i = 0; i < result.length; i++)
            result[i] = intersection[i];

        return result;
    }

    public static int[] removeItem(int[] array, int pos) {
        int[] newArray = new int[array.length - 1];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != pos) {
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }
}
