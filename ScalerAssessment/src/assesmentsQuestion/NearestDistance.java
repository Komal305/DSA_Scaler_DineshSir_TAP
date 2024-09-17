package assesmentsQuestion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NearestDistance {

	public static void main(String[] args) {
		
int[][]  A = { {0,0,0,1}, {0, 0, 1, 1}, {0,1,1,0} };
nearDistance(A);
	}
	
	public static void nearDistance(int[][] A){
		int n= A.length;
		int m= A[0].length;
		System.out.println("n="+n+" m="+m);
		int[][] B = new int[n][m];
		
		Queue<int[]> q= new LinkedList<>();
		
//		A = [
//		       [0, 0, 0, 1] [00, 01, 02, 03]
//		       [0, 0, 1, 1] [10, 11, 12, 13]
//		       [0, 1, 1, 0] [20, 21, 22, 23]
//		     ]
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(A[i][j]==1) {
					B[i][j] = 0;
					q.offer(new int[] {i, j} );//0,3||  1,2|1,3 || 2,1 | 2,2
				}else {
					B[i][j] = Integer.MAX_VALUE;
				}
			}
		}
		
		Arrays.stream(B).map(r -> Arrays.toString(r)).forEach(System.out::println);
		System.out.println();
		
		q.stream().map(Arrays::toString).forEach(System.out::println);
		System.out.println();
		int[][] dir = { {-1,0}, {1,0},{0,-1}, {0,-1} };
		
		while( ! q.isEmpty() ) {
			int[] curr = q.poll();
			int x = curr[0];//0__1__1__2_____2
			int y = curr[1];//3__2__3__1_____2
			
			for(int[] d:dir) {
				int nx = x + d[0];// 0+(-1) 0+1 0+0________1+(-1)=0 1+1 1+0___1+(-1) 1+1 1+(0)
				int ny = y + d[1];// 3+0  3+0 3+(-1)________2+0 =2  2+0 2+(-1)__3+0   3+0  3+(-1)
				System.out.println("nx"+ nx+ " ny= "+ ny);
				if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
					if(B[nx][ny] > B[x][y] +1 ) {// [1][3]>[0][3]+1 == 0>0+1 // [0][2]>[0][3]+1 == 2147483647>1// 1>0+1//[0][3]>[1][3]+1==0>0+1
						//B[0][2] > B[1][2]+1 == 1>1 // [1][1]>1
						B[nx][ny] = B[x][y] + 1;//  [0][2] = 1//[1][1] =0+1 
						q.offer(new int[] {nx, ny} );
					}
				}
				
				
			}
			
		}
		
		Arrays.stream(B).map(r-> Arrays.toString(r)).forEach(System.out::println);
		//return B;
	}

}
/*

Distance of nearest cell
 
Problem Description
Given a matrix of integers A of size N x M consisting of 0 or 1.

For each cell of the matrix find the distance of nearest 1 in the matrix.

Distance between two cells (x1, y1) and (x2, y2) is defined as |x1 - x2| + |y1 - y2|.

Find and return a matrix B of size N x M which defines for each cell in A distance of nearest 1 in the matrix A.

NOTE: There is atleast one 1 is present in the matrix.

Problem Constraints
1 <= N, M <= 1000

0 <= A[i][j] <= 1


Input Format
The first argument given is the integer matrix A.

Output Format
Return the matrix B.



Example Input
Input 1:

 A = [
       [0, 0, 0, 1]
       [0, 0, 1, 1] 
       [0, 1, 1, 0]
     ]
Input 2:

 A = [
       [1, 0, 0]
       [0, 0, 0]
       [0, 0, 0]  
     ]


Example Output
Output 1:

 [ 
   [3, 2, 1, 0]
   [2, 1, 0, 0]
   [1, 0, 0, 1]   
 ]
Output 2:

 [
   [0, 1, 2]
   [1, 2, 3]
   [2, 3, 4] 
 ]


Example Explanation
Explanation 1:

 A[0][0], A[0][1], A[0][2] will be nearest to A[0][3].
 A[1][0], A[1][1] will be nearest to A[1][2].
 A[2][0] will be nearest to A[2][1] and A[2][3] will be nearest to A[2][2].
Explanation 2:

 There is only a single 1. Fill the distance from that 1.
*/