package udemydatastructure.sortingAlgorithm;

public class InsertionSortDemo1 {
	public static void main(String[] args) {
		int[] a= {20,35,-15,7,55,1,-22};
		//int now=(int) System.currentTimeMillis();
		for(int i=1; i<a.length;i++) {
			int c=a[i]; int j=i-1;
			System.out.println(c+" "+a[j]);
			while(j>=0&&c<a[j])
			{
				System.out.println(c+"-- "+a[j]);
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=c;
		}
		
		
		//System.out.println(now);
		for(int p:a) {
			System.out.println(p+",");
		
		}
	}
}
