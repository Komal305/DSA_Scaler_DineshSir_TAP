package udemydatastructure.sortingAlgorithm;

public class ShellSort {
public static void main(String[] args) {
	 int[] array1 = {11, 2, -3, 44,5};//{-3, 2, 11, 44,5}  {-3, 2, 5, 44,11}  {-3, 2, 5,11, 44} 
 shellSort(array1);    
}

public static void shellSort(int[] n) {
	
	for(int gap=n.length/2;gap>0;gap/=2) 
	{
		for(int i=gap;i<n.length;i++) {
			int newElement=n[i];
			int j=i;
			while(j>=gap&&n[j-gap]>newElement) {
				n[j]=n[j-gap];
				j = j-gap;
			}
			n[j]=newElement;
		}
		
	}
	
	for(int print:n) {
		System.out.println(print);
	}
}
}
