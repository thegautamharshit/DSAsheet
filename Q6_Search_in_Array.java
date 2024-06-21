public class Q6_Search_in_Array {
    public Q6_Search_in_Array() {
    }

    static int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int x = search(nums, target);
        System.out.println(x);
    }
}