package maths3PrimeNumbers;

public class Q3SortedRank {
	public static void main(String[] args) {
		String A="abc";
	        int n=A.length();
	        
	        int mod=1000003;
	        long[] factR=new long[n];
	        
	        factorial(factR, n);
	        //for(long f:factR) System.out.println(f);
	        int rank=1;
	        for(int i=0; i<n; i++){
	            int small=countSmallerChar(A,i);
	            rank += small*factR[n-i-1];
	            rank %= mod;
	        }
	      //  return (int)rank;
	       // System.out.println(rank);
	}

	private static void factorial(long[] factR, int n) {
		
	factR[0]=1;
		for(int i=1; i<n; i++) {
			factR[i]=factR[i-1]*i;
		}
		
	}

	private static int countSmallerChar(String a, int ind) {
		int c=0;
		int curr=a.charAt(ind);
		for(int i=ind+1; i<a.length(); i++) {
			if(a.charAt(ind)<curr) System.out.println(c++); 
		}
		System.out.println(curr);
		return c;
	}

}