public class Q3_Array_Sum$KadaneAlgo {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur_sum = 0;

        for(int i = 0; i < nums.length; i++) {
            cur_sum += nums[i];
            if (max < cur_sum) {
                max = cur_sum;
            }

            if (cur_sum < 0) {
                cur_sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4, 5};
        int x = maxSubArray(n);
        System.out.println(x);
    }
}