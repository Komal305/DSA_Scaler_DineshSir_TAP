package dSA66_DP4ApplicationKnapsack;

import java.util.Arrays;

public class Q2CoinSumInfinite {
public static void main(String[] args) {
	int[] A= {1,2,3}; int B=4; 
        int n=A.length;
        int[] ans=new int[B+1];
        ans[0]=1;
        
        for(int i=0; i<n; i++){
            for(int j=A[i]; j<=B; j++){

ans[j] += ans[j-A[i]];
ans[j] %= 10000007; 
            }
        }
        //Arrays.stream(ans).toString();
    for(int a:ans)System.out.println(a);
}
}
