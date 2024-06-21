import java.util.Scanner;

public class Permutation_of_Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Read a full line of input
        permutations(s.toCharArray(), 0);
        sc.close(); // Close the Scanner
    }

    static void permutations(char[] ar, int fi) {
        if (fi == ar.length - 1) {
            System.out.println(new String(ar)); // Convert char array to string for better readability
        } else {
            for (int i = fi; i < ar.length; i++) {
                swap(ar, i, fi);
                permutations(ar, fi + 1);
                swap(ar, i, fi); // Swap back to original configuration
            }
        }
    }

    static void swap(char[] ar, int i, int fi) {
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }
}
