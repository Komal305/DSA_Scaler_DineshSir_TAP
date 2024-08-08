package dSA36Sorting1CountSortMergeSort;

public class Q2InversionCountArray {
static int mod=1000000007;
	public static void main(String[] args) {
		int[] A= {8,4,33,87,5,1,-7,7};
		int[] temp=new int[A.length];
		
		mergeSort(A, temp, 0, A.length-1);
		
	}
	
	public static long mergeSort(int[] arr,int[] temp, int left, int right){
		int mid;
		long count=0;
		if(right>left) {
			mid=(right+left)/2;
			count += mergeSort(arr, temp, left, mid);
			count += mergeSort(arr, temp, mid+1, right);
			count += mergeTwo(arr, temp, left, mid + 1, right);
		}
		System.out.println(count);
		return count%mod;
	}

	private static long mergeTwo(int[] arr, int[] temp, int left, int mid, int right) {
		int i,j,k;
		long count=0;
		i=left;
		j=mid;
		k=left;
		while((i<=mid-1)&&(j<=right)) {
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else {
				temp[k++]=arr[j++];
				count=count+(mid-i);
			}
		}
		
		while(i<=mid-1) {
			temp[k++] = arr[i++];
		}
		while(j<=right) {
			temp[k++] = arr[j++];
		}
		
		for( j=left; j<=right; j++)
		{
			arr[j]=temp[j];
		}
		return count%mod;
	}

}
