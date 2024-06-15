public class Q7_Next_Permutation {
    public static void nextPermutation(int[] nums) {
        final int n = nums.length;

        // From back to front, find the first number < nums[i + 1].
        int i;
        for (i = n - 2; i >= 0; --i)
            if (nums[i] < nums[i + 1])
                break;

        // From back to front, find the first number > nums[i], swap it with
        // nums[i].
        if (i >= 0)
            for (int j = n - 1; j > i; --j)
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }

        // Reverse nums[i + 1..n - 1].
        reverse(nums, i + 1, n - 1);
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    public static void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] n = {7,2,5,3,2,1,0};
        nextPermutation(n);

        for (int num : n) {
            System.out.print(num+" ");
        }
    }
}
