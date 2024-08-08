package dSA41TwoPointer;

public class Q3PairswithgivensumII {

	public static void main(String[] args) {

    int[] A= {1, 5, 7, 10}; int B=8;
    
        int i = 0, j = A.length - 1, mod = 1000 * 1000 * 1000 + 7;
        long ans = 0;
        while (i < j) {
            if (A[i] + A[j] == B) {
                int ii = i, jj = j;
                if (A[i] == A[j]) {
                   
                    long cnt = j - i + 1;
                    ans += (cnt * (cnt - 1) / 2) % mod;
                    ans %= mod;
                    break;
                } else {
                    
                    while (A[i] == A[ii]) {
                        ii++;
                    }
                    int cnt1 = ii - i;
                    i = ii;
                   
                    while (A[jj] == A[j]) {
                        jj--;
                    }
                    int cnt2 = j - jj;
                    j = jj;
                    ans += (cnt1 * cnt2) % mod;
                    ans %= mod;
                }
            } else if (A[i] + A[j] > B) {
                j--;
            } else i++;
        }
        System.out.println((int) ans);
       ;
    }
}