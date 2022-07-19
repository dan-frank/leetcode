class TwoSum {
    public static void main(String[] args) {
        int[] givenNums = {2, 7, 11, 15};
        int target = 9;
        
        int[] nums = twoSum(givenNums, target);
        System.out.println("[" + nums[0] + ", " + nums[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        printArray(nums);
        mergesort(nums, low, high);
        printArray(nums);
        int[] result = {0,1};
        return result;
    }

    public static void mergesort(int[] array, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;
        mergesort(array, low, mid);
        mergesort(array, mid+1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int a2Space = high - mid;
        int[] a1 = new int[mid];
        System.arraycopy(a, 0, a1, 0, mid);
        int[] a2 = new int[a2Space];
        System.arraycopy(a, mid, a2, 0, a2Space);
        
        int a1Count = 0;
        int a2Count = 0;

        while (a1Count < a1.length && a2Count < a2.length) {
            if (a1[a1Count] >= a2[a2Count]) {
                a[low] = a1[a1Count];
                a1Count++;
            } else {
                a[low] = a2[a2Count];
                a2Count++;
            }
            low++;
        }

        while (a1Count < a1.length) {
            a[low] = a1[a1Count];
            a1Count++;
            low++;
        }

        while (a2Count < a2.length) {
            a[low] = a2[a2Count];
            a2Count++;
            low++;
        }
    }
    
    public static void printArray(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
    }
}
