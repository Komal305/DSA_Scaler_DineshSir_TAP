package dSA28Math2CombinatoricsBasic;

public class SortedPermutationRank {
static int mod=1000003;
	public static void main(String[] args) {
		
System.out.println(permutation("VIEW"));
	}
static int fact(int A) {
	return (A==0||A==1)?1: A*fact(A-1)%mod;
}

static public int permutation(String A) {
	int n=A.length(); int ans=0;
	A=A.toLowerCase();
	for(int i=0; i<n-1; i++) {
		int count=0;
		for(int j=i+1; j<n; j++) {
			if(A.charAt(j)<A.charAt(i)) 
				count++;
			}
			ans = ans + (count*fact(n-i-1))%mod;
			//System.out.println(ans);
		
	}
	return (ans+1)%mod;
}
}
/*Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints
1 <= |A| <= 1000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank of the given string.



Example Input
Input 1:

A = "acb"
Input 2:

A = "a"


Example Output
Output 1:

2
Output 2:

1


Example Explanation
Explanation 1:

Given A = "acb".
The order permutations with letters 'a', 'c', and 'b' : 
abc
acb
bac
bca
cab
cba
So, the rank of A is 2.
Explanation 2:

Given A = "a".
Rank is clearly 1.*/