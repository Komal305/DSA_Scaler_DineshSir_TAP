package assesmentsQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class NearestHospital {

	static class Point{
		int x,y;
		Point(int x, int y)
		{
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		int[][] A = {{1,0,1,1},{1, 1, 0, 0},{1,0,0,0}, {1, 1, 0, 1}};
MaxDistance(A);
	}
	
	static void MaxDistance(int[][] A){
		int n = A.length, m=A[0].length;
		
		int[][] dir= {{0, 1},{1,0},{0,-1},{-1,0}};
		Queue<Point> q=new LinkedList<>();
		
		boolean hasHouse=false,hasHospital=false;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(A[i][j]==1) {
					q.offer(new Point(i, j));
					hasHospital=true;
				}else {
					hasHouse=true;
				}
			}
		}
		
		if(!hasHospital || !hasHouse) { System.out.println("-1"); return;
			//return -1;
			}
		
		int maxDis = -1;
		while(! q.isEmpty()) {
			Point p=q.poll();
			for(int[] d:dir) {
				int nx=p.x+d[0];
				int ny=p.y+d[1];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && A[nx][ny]==0) {
					A[nx][ny] = A[p.x][p.y]+1;
					maxDis = Math.max(maxDis, A[nx][ny]-1);
					q.offer(new Point(nx, ny));
				}
			}
		}
		System.out.println(maxDis);
	}

}
/*
Problem Description
In a bustling city, a team of researchers were studying the distribution of hospitals and houses in the city. They had collected data about the location of each hospital and each house, but they wanted to understand more about the distances between them.

To do this, they created an N x N grid denoted by A, where each cell represented a small area of the city. They labeled cells containing hospitals as 1 and cells containing houses as 0.

Their goal was to find a house that was farthest away from any hospital. If no house or hospital exists in the city, return -1.

Note: The distance used in this problem is the Manhattan distance: the distance between two cells (x1, y1) and (x2, y2) is |x1 - x2| + |y1 - y2|



Problem Constraints
1 <= N <= 103

A[i][j] = 0 or 1



Input Format
First argument A is a 2D array of integers


Output Format
Return an integer denoting the maximum distance of house cell from any hospital cell. If no house hospital exists, return -1.


Example Input
Input 1:

A = [ [1, 0, 1]
      [1, 0, 0]
      [1, 1, 1] ]
Input 2:

A = [ [1, 0, 1, 1]
      [1, 1, 0, 0]
      [1, 0, 0, 0]
      [1, 1, 0, 1] ]


Example Output
Output 1:

1
Output 2:

2


Example Explanation
Explanation 1:

All the houses have a hospital at a distance 1 from them.
Explanation 2:

The house at third row and third column is farthest from any hospital. The nearest hospital is at a distance 2.
*/