package udemydatastructure.searching;

public class BinarySearch {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	 System.out.println(binary(a, 5));//4th index 
	 System.out.println(recursionBinary(a, 5));
}

public static int binary(int[] a,int value){
	int start=0;
	int end=a.length;
	while(start<end) {
		int mid=(start+end)/2;
		if(a[mid]==value) return mid;
		else if(a[mid]<value) 
			start=mid+1;
		else  
			end=mid;
	}
	
	return -1;
}

public static int recursionBinary(int[] a,int value){
	return recursionBinarySearch(a,0,a.length,value);
}

private static int recursionBinarySearch(int[] a, int start, int end, int value) {
	if(start>=end) return -1;
	
	int mid=(start+end)/2;
	System.out.println(mid+"middle num");
	if(a[mid]==value) return mid;
	else if(a[mid]>value) 
		return recursionBinarySearch(a,start,mid,value);
	else
		return recursionBinarySearch(a,mid+1,end,value);
	
}
}
