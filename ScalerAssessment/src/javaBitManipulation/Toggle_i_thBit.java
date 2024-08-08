package javaBitManipulation;

public class Toggle_i_thBit {

	public static void main(String[] args) {
		int A=5;
		int B=2;
		System.out.println(A^(1<<B));
	}
}
/*You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value


Problem Constraints
1 <= A <= 109
0 <= B <= 30


Input Format
First argument A is an integer.
Second argument B is an integer.


Output Format
Return an integer.


Example Input
Input 1:
A = 4
B = 1
Input 2:
A = 5
B = 2


Example Output
Output 1:
6
Output 2:
1*/