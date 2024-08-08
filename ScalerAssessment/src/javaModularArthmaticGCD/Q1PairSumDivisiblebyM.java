package javaModularArthmaticGCD;

import java.util.Arrays;

public class Q1PairSumDivisiblebyM {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5}; int k=2;
		int n = a.length;
        long mod = (long)(1e9 + 7);
        long cnt[] = new long[k];
        // cnt[i] stores the count of elements such that their modulo k equals i
        for(int x : a)    cnt[x % k]++;
        long ans = cnt[0] * (cnt[0] - 1) / 2;
        for(int i = 1, j = k - 1; i <= j; i++, j--) {
            if(i == j)    
                ans = (ans + cnt[i] * (cnt[i] - 1) / 2) % mod;
            else    
                ans = (ans + cnt[i] * cnt[j]) % mod;
        }
     

		//int B=2, n=A.length, mod=(int) (1e9+7), ans=0;
		
//		int[] c = new int[B];
//		
//		
//		for(int i=0; i<n; i++) 
//			c[A[i]%B]++;
//			System.out.println(Arrays.toString(c));
//			ans += (c[0]*(c[0]-1))/2;
//			ans%=mod;
//			
//			int p=1,q=B-1;
//			while(p<=q) {
//				if(p==q) {
//					ans += (c[p]*(c[q]-1))/2;
//					ans%=mod;
//				}else {
//					ans += c[p]*c[q];
//					ans %= mod;
//				}
//				p++; q--;
//			}
//			
//		
//		
		System.out.println(ans);
	}

}
/*Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.

Since the answer may be large, return the answer modulo (109 + 7).

Note: Ensure to handle integer overflow when performing the calculations.


Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 106



Input Format
The first argument given is the integer array A.
The second argument given is the integer B.



Output Format
Return the total number of pairs for which the sum is divisible by B modulo (109 + 7).



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 2
Input 2:

 A = [5, 17, 100, 11]
 B = 28


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:
 All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5). 
 So total 4 pairs.
Explanation 2:
 There is only one pair which is divisible by 28 is (17, 11)



 sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
 
 */