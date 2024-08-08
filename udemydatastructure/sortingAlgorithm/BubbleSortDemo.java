package udemydatastructure.sortingAlgorithm;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] a= {20,33,-1,23,1,55};
		for(int i=a.length-1;i>0;i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int a1:a) {
			System.out.print(a1+",");//-1,1,20,23,33,55,
		}
	}

}
