public class Q9_MIssing_Repeating_Num {

    /*Repeat and Missing Num Array
     arr = [4,3,6,2,1]
     lets calculate sum of natural number and then subtract with sum of n (0 to arr.length();)
     [4+3+6+2+1] - [1+2+3+4+5+6]
          1      -      5     =   -4;
          x      -      y     =   -4; ---------(eq  - 1);                   val1 = s - sumNat

     now same thing with sum of square
     [4^2 + 3^2 + 6^2 + 2^2 + 1^2 + 1^2] - [1^2 + 2^2 + 3^2 + 4^2 + 5^2 + 6^2]
                    1                    -                 25
                   x^2                   -                 y^2       =   -24 --------(eq - 2);      val2 = s2 - sumSqur
                                                                                                    val2 = val2/val1;
                   (x-y)(x+y) = -24;
                   x+y = -24 / x-y;
                   x=y = -24 / -4 ; (by eq 1)
                   x+y = 6;

                   x + y = 6
                 + x - y = -4
                  ------------
                  2x = 2
                  x = 1             similarly x+y = 6;
                                              1+y = 6;
                                                y = 5;
     */
    public int[] repeatedNumber(final int[] A) {
        int n = A.length;
        long s = 0, s2 = 0;
        for (int i = 0; i < n; i++) {
            s += (long) A[i];
            s2 += (long) A[i] * A[i];
        }
        long sumnat = (long) n * (n + 1) / 2;
        long sumsquar = (long) n * (n + 1) * (2 * n + 1) / 6;

        long val1 = s - sumnat;
        long val2 = s2 - sumsquar;
        val2=val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[] {(int) x, (int) y};

    }
}
