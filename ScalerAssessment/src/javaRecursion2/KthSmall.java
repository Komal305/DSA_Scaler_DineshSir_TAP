package javaRecursion2;

public class KthSmall {
public static void main(String[] args) {
		System.out.println(solve(3, 0));//0
}
public static int solve(int A, long B) {
    if(A==1) return 0;

    long mid=(long)Math.pow(2,A-2);
   
   if(B<mid)
       return solve(A-1,B);
       
       return 1-solve(A-1, B-mid); 
}
}
/*Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).



Problem Constraints
1 <= A <= 10^5

0 <= B <= min(2A - 1 - 1 , 1018)



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer denoting the Bth indexed symbol in row A.



Example Input
Input 1:

 A = 3
 B = 0
Input 2:

 A = 4
 B = 4


Example Output
Output 1:

 0
Output 2:

 1
*/