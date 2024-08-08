package arraysJava;

public class ZeroEndArray {
public static void main(String[] args) {
	//int[] a= {6,1,0,5,0,3,0,4,4};
	int[] a= {8,3,8,1,0,2,1,0,3,0,0,7,8,0,0};
	for(int f:a) System.out.print(f+" ");
	System.out.println();
	MoveZeroToEnd(a);
	//MoveZeroToEnd(a,a.length);
	
	double now=System.currentTimeMillis();
	System.out.println("current time :"+ (System.currentTimeMillis()-now));
}

static void MoveZeroToEnd(int[] a){
	int n=a.length-1;
	for(int i=0;i<=n;i++) {
		if(a[i]==0) {
			while(a[n]==0) {
				n--;
			}
			int temp=a[i];
			a[i]=a[n];
			a[n]=temp;
			n--;
		}
	}
	
	for(int f:a) System.out.print(f+" ");
}
//static void MoveZeroToEnd(int[] a , int n){
//	int j=0;
//	for(int i=0;i<n;i++) {
//		if(a[i]!=0&&a[j]==0) {
//			int temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//		}
//		if(a[j]!=0) j++;
//	}
//	
//	for(int f:a) System.out.print(f+" ");
//}


}
