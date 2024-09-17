package assesmentsQuestion;

public class LongestSubstring {

	public static void main(String[] args) {
		
	}

}
/*
Problem Description
Given a String A, find the length of longest special substring.


A substring is called special if each character in substring occurs for atmost two times.



Problem Constraints
1 <= length(A) <= 105

String A contains uppercase characters [A - Z], lowercase characters [a - z] and digits [0 - 9].


Input Format
Single argument representing the string A.


Output Format
Return a single integer denoting the length of longest special substring.


Example Input
Input 1:


A = abcabc2Ab

Input 2:


A = aaabbbccc


Example Output
Output 1:


8

Output 2:


4


Example Explanation
Expalnation 1:

The substring abcabc2A will be the unique substring because add b to the end will increase the frequency of b to 3.
Expalnation 2:

There are 2 unique special substrings, aabb & bbcc whose length is 4. */