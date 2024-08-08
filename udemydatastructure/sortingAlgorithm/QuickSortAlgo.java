package udemydatastructure.sortingAlgorithm;

public class QuickSortAlgo {
public static void main(String[] args) {
	int[] a= {5,4,6,2,9,1};
	sort(a, 0, a.length);
	
	for(int i:a) {
		System.out.print(i+", ");
	}
}

public static void sort(int[] arr, int start,int end){
	if(end-start<2)return;
	int pivot=Partition(arr, start ,end);
	sort(arr,start, pivot);
	sort(arr,pivot+1,end);
}

private static int Partition(int[] arr, int start, int end) {
	int pivot=arr[start];
	int i=start;int j=end;
	System.out.println(j);
	while(i<j) {
		
		while(i<j&&arr[--j]>=pivot);
	
		if(i<j)  {arr[i]=arr[j];}
	
		while(i<j&&arr[++i]<=pivot);
		if(i<j)  {arr[j]=arr[i];}
		
	}
		arr[j]=pivot;
	return j;
}
}
