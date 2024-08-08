package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AQ1AllUniquePermutations {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 2));
		permute(A);
	}
	
	static public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        Collections.sort(A);
        HashSet<ArrayList<Integer>> ans=new HashSet<>();
        UniquePermutation(A, 0, ans);

        ArrayList<ArrayList<Integer>> ans1= new ArrayList<>(ans);
        System.out.println(ans1);
        return ans1;
    }
	
	static void  UniquePermutation(ArrayList<Integer> A, int start, HashSet<ArrayList<Integer>> ans){
	       if(start==A.size()){
	ans.add(new ArrayList<>(A));
	return;
	        }

	        for(int i=start; i<A.size(); i++){
	            Collections.swap(A, start, i);
	            UniquePermutation(A, start+1, ans);
	            Collections.swap(A, start, i);
	        }
	    }

}
