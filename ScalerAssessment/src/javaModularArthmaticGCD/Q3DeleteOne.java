package javaModularArthmaticGCD;

public class Q3DeleteOne {

	public static void main(String[] args)
	{
	int[] A = {15,12,18};
	System.out.println(solve(A));
	}
	
	
	
	
	static public int  solve(int[] A) {
		
		int[]  s=sufix(A);
		int ans=1; int curGcd=0;
		for(int i=0; i<A.length; i++) {
			
			 if(i!=(A.length-1))
				ans=Math.max(ans, Gcd(s[i+1], curGcd));
			else
				ans=Math.max(ans, curGcd);
			 
			 curGcd=Gcd(curGcd, A[i]);
		}
		return ans;
		
	}
	
static public int[] sufix(int[] A) {
    int n=A.length;
        int[] S=new int[n];
        
        int val2=0;
        for(int i=n-1; i>=0; i--){
           val2=Gcd(val2, A[i]);
           S[i]=val2;
        }
        return S;
    }
	
	static public int Gcd(int a,int b){
        if(a==0) return b;
        return Gcd(b%a, a);
    }

}
/*Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.



Problem Constraints
2 <= N <= 105
1 <= A[i] <= 109



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the maximum value of GCD.



Example Input
Input 1:

 A = [12, 15, 18]
Input 2:

 A = [5, 15, 30]


Example Output
Output 1:

 6
Output 2:

 15


Example Explanation
Explanation 1:

 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum value of gcd is 6.
Explanation 2:

 If you delete 5, gcd will be 15.
 If you delete 15, gcd will be 5.
 If you delete 30, gcd will be 5.
 Maximum value of gcd is 15.*/