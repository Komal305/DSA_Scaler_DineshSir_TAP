package udemydatastructure.sortingAlgorithm;


public class SelectionSortDemo {
public static void main(String[] args) {
	int[] a = {20,35,-15,7,55,1,-22};
	double now=System.currentTimeMillis();
	//TimeComplexcity t=new TimeComplexcity();
	

	for(int lastUnsortedIndex=a.length-1; lastUnsortedIndex >0;lastUnsortedIndex--) {
		int largest=0;
		for(int i=1;i<lastUnsortedIndex;i++) {
			if(a[i]>a[largest]) {
				largest=i;
			}
		}
		swap(a, lastUnsortedIndex, largest);		
		}
	
	System.out.println(now);//1.70882857128E12 //57128 627301
	for(int p:a) {
		System.out.println(p+",");
	
	}
	}

public static void swap(int[] a1,int i, int j) {
	if(i==j) {return ;}
	 int temp=a1[i];
	 a1[i]=a1[j];
	 a1[j]=temp;
}
}
