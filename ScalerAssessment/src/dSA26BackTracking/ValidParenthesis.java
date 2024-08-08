package dSA26BackTracking;

import java.util.ArrayList;

public class ValidParenthesis {
static ArrayList<String> ans;

	public static void main(String[] args) {
		int A=3;
		ans=new ArrayList<>();
		paranthesis(A, 0, 2*A, "");
		
		for(String n:ans)System.out.print(n+" ");
	}
	
	static public void paranthesis(int cnt, int dif, int n, String s) {
		if(n==0) {
			ans.add(s);
			return;
		}
		
		if(cnt>0)
			paranthesis(cnt-1, dif+1, n-1, s+"(");
		if(dif>0)
			paranthesis(cnt, dif-1, n-1, s+")");
		
	}

}
/*Problem Description
Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.



Problem Constraints
1 <= A <= 10



Input Format
First and only argument is integer A.



Output Format
Return a sorted list of all possible parenthesis.



Example Input
Input 1:

A = 3
Input 2:

A = 1


Example Output
Output 1:

[ "((()))", "(()())", "(())()", "()(())", "()()()" ]
Output 2:

[ "()" ]


Example Explanation
Explanation 1:

 All paranthesis are given in the output list.
Explanation 2:

 All paranthesis are given in the output list.
 
 A=3;
 
                               paranthesis(3, 0, 6, "")
                              /                         \
                             /                           \
      paranthesis(2, 1, 5, "(")                            paranthesis(2, 0, 4, "()")
    /                           \                               /                    \
paranthesis(1, 2, 4, "((") paranthesis(1, 1, 3, "(()") paranthesis(1, 1, 3, "()(")  paranthesis(1, 0, 2, "()()")
      /       \                  /        \                   /        \                     /        \
paranthesis(0, 3, 3, "(((") paranthesis(1, 1, 3, "(()")  paranthesis(0, 2, 2, "()((")  paranthesis(0, 1, 1, "()()(")
    |               \                   |                    \                 |                     \               
paranthesis(0, 2, 2, "((()") paranthesis(1, 0, 2, "(())") paranthesis(0, 1, 1, "()(()")  paranthesis(0, 0, 0, "()()()")
    |                |                    |                  |                 
paranthesis(0, 1, 1, "((())") paranthesis(0, 0, 0, "(())()") paranthesis(0, 0, 0, "()(())")
    |                |                    |                  
paranthesis(0, 0, 0, "((()))") paranthesis(0, 0, 0, "(()())")
 */