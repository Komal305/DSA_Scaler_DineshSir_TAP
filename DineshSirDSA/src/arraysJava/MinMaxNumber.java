package arraysJava;

public class MinMaxNumber {
public static void main(String[] args) {
	int[] a= {6,3,9,5,7};
	minimumNum(a);
	maximumNum(a);
}

public static void minimumNum(int[] a) {
	int min=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]<min)
			min=a[i];
	}
	System.out.println("minimum num of array: "+min);
}

public static void maximumNum(int[] a) {
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max)
			max=a[i];
	}
	System.out.println("maximum num of array: "+max);
}
}
