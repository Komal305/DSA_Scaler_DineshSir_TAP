package javaBitManipulation2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4FindTwoMissingNumber {

	public static void main(String[] args) {
	ArrayList<Integer> A=new ArrayList<>(Arrays.asList(5, 1, 3, 6));	
ArrayList<Integer> ans=new ArrayList<>();
int n=A.size();

int xorAll=0;

for(int a:A) xorAll ^= a;

for(int i=1; i<=n+2; i++) xorAll ^=i;

int setBit = xorAll & -xorAll;

int x1=0,x2=0;

for(int num:A) {
	if((num & setBit)==0) x1^=num;
	else x2^=num;
}

for(int i=1; i<=n+2; i++) {
	if((i&setBit)==0) x1^=i;
	else x2 ^= i;
}
ans.add(Math.min(x2, x1));
ans.add(Math.max(x2, x1));

System.out.println(ans);

	}

}
/*Given an array A of length N where all the elements are distinct and are in the range [1, N+2].

Two numbers from the range [1, N+2] are missing from the array A. Find the two missing numbers.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= N+2

The elements of array A are distinct



Input Format
Only argument A is an array of integers



Output Format
Return a sorted array of size 2 denoting the missing elements.



Example Input
Input 1:
A = [3, 2, 4]
Input 2:
A = [5, 1, 3, 6]


Example Output
Output 1:
[1, 5]
Output 2:
[2, 4]


Example Explanation
For Input 1:
The missing numbers are 1 and 5.
For Input 2:
The missing numbers are 2 and 4.*/
