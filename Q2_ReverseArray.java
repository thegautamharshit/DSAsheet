public class Q2_ReverseArray {
    public Q2_ReverseArray() {
    }

    static void print(int[] n) {
        for(int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }

        System.out.println();
    }

    static void reverse(int[] arr) {
        int[] new_arr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[arr.length - i - 1];
        }

        print(new_arr);
    }

    static void reverse_2(int[] arr) {
        int i = 0;

        for(int j = arr.length - 1; i < j; j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }

        print(arr);
    }

    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4, 5};
        print(n);
        reverse_2(n);
    }
}
