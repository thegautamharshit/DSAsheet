public class Q12_product_of_Array_Except_Self {

    public static void main(String[] args) {
        // int [] nums = {1,2,3,4};
        int [] nums2 = {-1,1,0,-3,3};

        int [] x = productExceptSelf(nums2);
        for(int i:x){
            System.out.println(i);
        }
        
        
    }

    // O(n) & O(n)

    public static int[] product (int [] nums){
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        left[0] = 1;
        right[nums.length-1] = 1;
        

        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1] * nums[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
        }

        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = left[i] * right [i];
        }
        return ans;
    }

    //O(n) & O(1)
    public static int[] productExceptSelf (int [] nums){
        int n = nums.length;

        int[] result = new int[n];
        result [0] = 1;

        for(int i=1;i<n;i++){
            result[i] = result[i-1] * nums[i-1];
        }

        int rightproduct = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i] * rightproduct;
            rightproduct *= nums[i];
        }

        return result;

    }
}