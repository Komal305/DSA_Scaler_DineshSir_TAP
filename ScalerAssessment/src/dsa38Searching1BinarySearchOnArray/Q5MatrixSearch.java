package dsa38Searching1BinarySearchOnArray;

public class Q5MatrixSearch {

	public static void main(String[] args) {
		int[][] A= {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
		int B=333;
		
		System.out.println(A[0].length);
		
		int i=0; int j=A[0].length-1;
		
		while(i<=j) {
			
			//int mid=i+(j-i)/2;
			if(A[i][j]==B) {
				System.out.println("true");
				return;
			}else if(A[i][j]>B)
				j--;
			else
				i++;
		}
		
		
	}
	
}
