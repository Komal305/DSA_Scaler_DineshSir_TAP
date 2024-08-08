package searchingSort;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {1,3,4,5,67,64};
		int d=55;
		System.out.println(Linear(arr, d));
	}

	public static boolean Linear(int[] A,int data){
		
		for(int i=0; i<A.length; i++) {
			if(A[i]==data) return true;
		}
		return false;
	}
	
}
