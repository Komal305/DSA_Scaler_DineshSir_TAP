package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1GenerateallParenthesesII {
static ArrayList<String> ans;
	public static void main(String[] args) {
		int A=3;
		generateParenthesis(A);//[((())), (()()), (())(), ()(()), ()()()]


	}
	static  public String[] generateParenthesis(int A) {
	        ans = new ArrayList<>();
	solve(A,0, 2*A, "");
	String[] result=new String[ans.size()];
	result = ans.toArray(result);
	
	System.out.println(Arrays.toString(result));
	return result;
	    }
	  
	 static public void solve(int cnt, int dif, int n , String s){

		  if(n==0){
		      ans.add(s);
		      return ;
		  }

		  if(cnt>0){
		  solve(cnt-1, dif+1, n-1, s+"(");
		  }
		  if(dif>0){
		  solve(cnt, dif-1, n-1, s+")");
		  }


		      }

}
