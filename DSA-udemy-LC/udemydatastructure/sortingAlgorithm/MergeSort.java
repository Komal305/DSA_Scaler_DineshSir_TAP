package udemydatastructure.sortingAlgorithm;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {20,35,-15,7,55,1,-22};
     sort(arr, 0, arr.length);
     for(int i=0; i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
	}

	public static void sort(int[] input, int start, int end){
		if(end-start>2) {
		return;}
		int mid= start+end/2;
		sort(input, start, mid);
		sort(input, mid, end);
		merge(input, start, mid, end);
		
	}
	
	public static void merge(int[] input , int start, int mid, int end) {
		if(input[mid-1]<= input[mid]) {
			return;
		}
		int i=start; int j=mid; int temp=0;
		int[] tempArray=new int[end-start];
		while(i<mid && j<end)
		{
			tempArray[temp++]=input[i]<=input[j]?input[i++]:input[j++];
		}
		System.arraycopy(input, i, input, start+temp, mid-1);
		System.arraycopy(tempArray, 0, input, start, temp);
	}
}
