package dSA36Sorting1CountSortMergeSort;

public class Q1MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] A = {4, 7, 9};
		int[] B = {2, 11, 19};
		
		int[] merge=new int[A.length+B.length];
		
		int i=0; int j=A.length;
		int m=0; int n=B.length;
		
		int k=0;
		
		while(i<j && m<n) {
			
			if(A[i]<B[m]) {
				merge[k]=A[i];
			i++;k++;
			}
			else {
				merge[k]=B[m];
				m++;k++;
			}
				
		}
		
		while(i!=j)
		{
			merge[k++]=A[i++];
		}
		
		while(m!=n) {
			merge[k++]=B[m++];
		}
		
		for(int arr:merge) {
			System.out.print(arr+" ");
		}
		
	}

}
/*Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.

Note: A linear time complexity is expected and you should avoid use of any library function.


Problem Constraints
-2×109 <= A[i], B[i] <= 2×109
1 <= |A|, |B| <= 5×104


Input Format
First Argument is a 1-D array representing  A.
Second Argument is also a 1-D array representing B.


Output Format
Return a 1-D vector which you got after merging A and B.


Example Input
Input 1:
A = [4, 7, 9]
B = [2, 11, 19]

Input 2:
A = [1]
B = [2]


Example Output
Output 1:

[2, 4, 7, 9, 11, 19]
Output 2:

[1, 2]


Example Explanation
Explanation 1:

Merging A and B produces the output as described above.
Explanation 2:

 Merging A and B produces the output as described above.
 
 public ArrayList < Integer > solve(final List < Integer > A, final List < Integer > B) {
        int m = A.size(), n = B.size();
        ArrayList < Integer > res = new ArrayList < Integer > ();
        if (A == null && B == null)
            return null;
        if (A == null) {
            for (int i = 0; i < n; i++)
                res.add(B.get(i));
            return res;
        }
        if (B == null) {
            for (int i = 0; i < m; i++)
                res.add(A.get(i));
            return res;
        }
        int i, j;
        int k = 0;
        // i and j points to the elements of A and B respectively
        for (i = 0, j = 0; k < m + n; k++) {
            if (i >= m)
                res.add(B.get(j++));
            else if (j >= n)
                res.add(A.get(i++));
            else if (A.get(i) <= B.get(j))
                res.add(A.get(i++));
            else
                res.add(B.get(j++));
        }
        return res;
    }
}*/