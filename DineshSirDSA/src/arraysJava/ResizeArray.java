package arraysJava;

public class ResizeArray {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	resize(a, a.length*3);
	
}
	
	public static void resize(int[] a,int capacity) {
		int[] temp=new int[capacity];
		for(int i=0; i<a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
		for(int f:a) System.out.print(f+" ");
	}
}
