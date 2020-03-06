// QUESTION
// Given two arrays, write a function to compute their intersection.

import java.util.Arrays;

class IntersectionOfArraysII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{61,24,20,58,95,53,17,32,45,85,70,20,83,62,35,89,5,95,12,86,58,77,30,64,46,13,5,92,67,40,20,38,31,18,89,85,7,30,67,34,62,35,47,98,3,41,53,26,66,40,54,44,57,46,70,60,4,63,82,42,65,59,17,98,29,72,1,96,82,66,98,6,92,31,43,81,88,60,10,55,66,82,0,79,11,81}, new int[]{5,25,4,39,57,49,93,79,7,8,49,89,2,7,73,88,45,15,34,92,84,38,85,34,16,6,99,0,2,36,68,52,73,50,77,44,61,48})));
        System.out.println(Arrays.toString(new int[]{5,4,57,79,7,89,88,45,34,92,38,85,6,0,77,44,61}));
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
                    break;
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
