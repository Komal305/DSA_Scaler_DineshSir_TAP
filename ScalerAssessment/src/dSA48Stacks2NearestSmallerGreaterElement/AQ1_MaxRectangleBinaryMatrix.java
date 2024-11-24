package dSA48Stacks2NearestSmallerGreaterElement;

public class AQ1_MaxRectangleBinaryMatrix {

	public static void main(String[] args) {
		
		int[][] A = {{0,1,1},{1,1,0},{1,1,1}};
		
		 int n=A.length, m=A[0].length;
	        int[][] B = new int[n][m];

	        for(int i=0; i<n; i++){
	            for(int j=0; j<m; j++){
	            //   B[i][j]=A[i][j];
	               if(j!=0)
	                B[i][j] = A[i][j]+B[i][j-1];

	            }
	        }

	        for(int[] r :B) {
	        	for(int rr:r)
	        	System.out.print(rr+", ");
	        	System.out.println();
	        }
	}

}
