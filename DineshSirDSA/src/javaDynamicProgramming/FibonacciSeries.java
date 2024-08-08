package javaDynamicProgramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" "+RecursionFibno(10));
System.out.println(" "+DynamicFibno(10));
	}
	
	static int  RecursionFibno(int n){
		if(n==0)return 0;
		if(n==1)return 1;
		return RecursionFibno(n-2)+RecursionFibno(n-1);		
	}
	
	static int DynamicFibno(int n) {
		int[] dp=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2; i<=n; i++) {
			dp[i]=dp[i-2]+dp[i-1];
		}
	for(int d:dp)System.out.print(d+" ");
	return dp[n];
	}

}
