package dSA37_Sorting2QuickSortComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Q3_BClosestPoint {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> A = new ArrayList<>();
		A.add(new ArrayList<>( Arrays.asList(1, -1)));
		A.add(new ArrayList<>( Arrays.asList(2, -1)));
int B= 1;
Collections.sort(A,new Comparator<ArrayList<Integer>>(){
 public  int compare(ArrayList<Integer> a, ArrayList<Integer> b)
{
		long p = a.get(0)*a.get(0)+a.get(1)*a.get(1);
		long q = b.get(0)*b.get(0)+b.get(1)*b.get(1);
		return (p<q)? -1 :(p>q)? 1:0;
}
		});
ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
for(int i=0; i<B; i++) {
	ans.add(A.get(i));
}
ans.forEach(System.out::print);
	}

}
