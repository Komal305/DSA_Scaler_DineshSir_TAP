package dSA36Sorting1CountSortMergeSort;

public class AQ2MaxChunksToMakeSorted {

	public static void main(String[] args) {

		int[] A= {2,0,1,3};
		int c=0; int max=-1; int i=0;
		for(int a:A) {
			max=Math.max(max, a);
			System.out.println(max+" "+i);
			if(max==i)
			{
				c++;
				
			}
				
			i++;
		}
	}

}
