package udemydatastructure.sortingAlgorithm;

public class CountingSort {
public static void main(String[] args) {
	int[] a= {2,5,9,8,2,8,7,10,4,3};//2,2,3,4,5,7,8,8,9,10,
	countingSortMethod(a, 1, 10);
	for(int p:a) {
		System.out.print(p+",");
	
	}
}
public  static void countingSortMethod(int[] a, int min, int max){
	int[] countArray= new int[(max-min)+1];//empty array length of 10
	for(int i=0; i<a.length;i++) {
	countArray[a[i]-min]++;
	}
	
	int j=0;
	for(int i=min;i<=max;i++) {
		//System.out.print(countArray[i-min]+","); //0,2,1,1,1,0,1,2,1,1,
		while(countArray[i-min]>0)
		{
			a[j++]=i; 
			countArray[i-min]--;
		}
	}
}
}
