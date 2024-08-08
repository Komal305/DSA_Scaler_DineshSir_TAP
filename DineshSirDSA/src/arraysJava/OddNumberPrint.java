package arraysJava;

public class OddNumberPrint {
public static void main(String[] args) {
	int[] a= {6,3,9,5,7};
	OddElementsOfArrayPrint(a);//3 9 5 7 
}

public static void OddElementsOfArrayPrint(int[] a) {
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0)count++;
	}
	
	int[] odd=new int[count];
	int indx=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) 
			odd[indx++]=a[i];
	}
	
	for(int f:odd) System.out.print(f+" ");
	
}

}
