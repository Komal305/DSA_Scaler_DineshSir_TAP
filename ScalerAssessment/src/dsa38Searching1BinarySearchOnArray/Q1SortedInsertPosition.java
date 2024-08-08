package dsa38Searching1BinarySearchOnArray;

public class Q1SortedInsertPosition {

	public static void main(String[] args) {
		int[] A= {1, 4, 9}; int B=3;
		int left=0;
		int right=A.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(A[mid]==B) {
				System.out.println(mid);
			return;
		}
			else if(A[mid]<B)
				left=mid+1;
			else
				right = mid-1;
			
		}
		
		
		
					System.out.println(left);
				
	}

}
