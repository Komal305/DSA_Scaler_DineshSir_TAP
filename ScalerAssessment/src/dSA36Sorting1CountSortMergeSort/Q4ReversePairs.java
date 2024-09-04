package dSA36Sorting1CountSortMergeSort;

public class Q4ReversePairs {

	public static void main(String[] args) {
		int[] A= {1,3,2,3,1};
		int ans=mergeSortCount(A, 0, A.length-1);
		System.out.println(ans);

	}

	private static int mergeSortCount(int[] A, int i, int j) {
		if(i<j) {
			int mid=(i+j)/2;
			
			int count = mergeSortCount(A, i, mid)+mergeSortCount(A, mid+1, j);;
			
			int p=mid+1;
			
			for(int k=i; k<=mid; k++) {
				while(p<=j && A[k]>A[p]*2) p++;
				count += p-(mid+1);
				
			}merge(A, i, mid, j);
			return count;
			
		}else return 0;
		
	}

	private static void merge(int[] A, int i, int mid, int j) {
		int n1=mid-i+1;
		int n2=j-mid;
		System.out.println(n1+"  "+n2);
		int[] L=new int[n1], R =new int[n2];
		
		for(int p=0; p<n1; p++)
			L[p]=A[i+p];
		
		for(int q=0; q<n2; q++)
			R[q]=A[mid+1+q];
		
		int u=0, v=0;
		
		for(int k=i; k<=j; k++) {
			if(v >= n2 || (u<n1 && L[u]<=R[v]))
				A[k]=L[u++]; else A[k]=R[v++];
		}
		
	}

}
