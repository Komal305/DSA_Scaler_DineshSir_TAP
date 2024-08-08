package udemydatastructure.sortingAlgorithm;

public class InsertionSortDemo {

	public static void main(String[] args) {
		int[] a= {20,35,-15,7,55,1,-22};
		int now=(int) System.currentTimeMillis();
		
		 
		for(int firstUnsortedIndex=1;firstUnsortedIndex<a.length;firstUnsortedIndex++)
		{
			int newElement=a[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0&&a[i-1]>newElement;i--)
			{
				a[i]=a[i-1];
				System.out.println(a[i]+"  ,"+a[i-1]);
			}
			a[i]=newElement;
		}
		
		
		System.out.println(now);
		for(int p:a) {
			System.out.println(p+",");
		
		}
	}

}
