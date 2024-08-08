package arraysJava;

public class ReverseArray {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5,6};
	reverse(a, 0, a.length-1);
	
}

public void shiftKTime() {
	
}
public static void reverse(int[] a,int start,int end) {
	while(start<end) {
		int temp=a[start];
		a[start++]=a[end];
		a[end--]=temp;
	}
	
	for(int i=start;i<end;i++) {//more time here
		int t=a[start];
		a[start++]=a[end];
		a[end--]=t;
	}
	for(int f:a) System.out.print(f+" ");
}
}
