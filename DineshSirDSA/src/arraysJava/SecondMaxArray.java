package arraysJava;

public class SecondMaxArray {
	public static void main(String[] args) {
		int[] a= {6,3,9,5,7};
		maximumNum(a);
	}

	
	public static void maximumNum(int[] a) {
		int max1st=Integer.MIN_VALUE;
		int max2nd=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1st) {
				//max2nd=max1st;
				max1st=a[i];
			}else if(a[i]>max2nd && a[i]!=max1st )
				max2nd=a[i];
		}
		System.out.println("maximum num of array: "+max2nd);
	}
}
