import java.util.Arrays;

public class Q1_Min_Max_Sum {
    public Q1_Min_Max_Sum() {
    }

    public static int findSum(int[] A, int N) {
        int min = A[0];
        int max = A[0];

        for(int i = 0; i < N; ++i) {
            if (A[i] > max) {
                max = A[i];
            }

            if (A[i] < min) {
                min = A[i];
            }
        }

        return min + max;
    }

    public static int findSum1(int[] A, int N) {
        Arrays.sort(A);
        int min = A[0];
        int max = A[N - 1];
        return min + max;
    }

    public static void main(String[] args) {
        int N = 5;
        int[] A = new int[]{-2, 1, -4, 5, 3};
        int x = findSum(A, N);
        int y = findSum1(A, N);
        System.out.println(x);
        System.out.println(y);
    }
}