class CountGoodTriplets {
    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 1, 9, 7};
        int[] arr2 = {1, 1, 2, 2, 3};
        System.out.println("Expected:4 | Actual:" + countGoodTriplets(arr1, 7, 2, 3));
        System.out.println("Expected:0 | Actual:" + countGoodTriplets(arr2, 0, 0, 1));
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if ( Math.abs(arr[i] - arr[j]) <= a
                        && Math.abs(arr[j] - arr[k]) <= b
                        && Math.abs(arr[i] - arr[k]) <= c ) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
