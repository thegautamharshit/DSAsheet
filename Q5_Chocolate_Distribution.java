import java.util.Arrays;

public class Q5_Chocolate_Distribution {

    static void check1(int[] arr, int m) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - m + 1; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (min > diff) {
                min = diff;
            }
        }

        System.out.println(min);
    }

    static void check2(int[] n, int m) {
        Arrays.sort(n);
        int min_diff = Integer.MAX_VALUE;

        for(int i = 0; i < n.length; i++) {
            int nextwindow = i + m - 1;
            if (nextwindow >= n.length) {
                break;
            }

            int diff = n[nextwindow] - n[i];
            min_diff = Math.min(diff, min_diff);
        }

        System.out.println(min_diff);
    }

    public static void main(String[] args) {
        int[] n = new int[]{12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        int[] n2 = new int[]{3, 4, 1, 9, 56, 7, 9, 12};
        int m2 = 5;
        int[] n3 = new int[]{7, 3, 2, 4, 9, 12, 56};
        int m3 = 3;
        check1(n, m);
        check1(n2, m2);
        check1(n3, m3);
        System.out.println("----------------------------------");
        check2(n, m);
        check2(n2, m2);
        check2(n3, m3);
    }
}
