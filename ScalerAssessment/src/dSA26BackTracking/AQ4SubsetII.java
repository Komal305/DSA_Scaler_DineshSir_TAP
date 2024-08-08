package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class AQ4SubsetII {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 2));
subsetsWithDup(A);
	}
	
	static public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
		    Collections.sort(A);
		    HashSet<ArrayList<Integer>> ans = new HashSet<>();
		    ArrayList<Integer> cur=new ArrayList<>();
		    solve(0, cur, A, ans);

		    ArrayList<ArrayList<Integer>> ans1=new ArrayList<>(ans);
	
		    Collections.sort(ans1, (ArrayList<Integer> i1, ArrayList<Integer> i2 )->{
		        for(int i=0; i<i1.size() && i<i2.size(); i++){
		            if(i1.get(i) < i2.get(i)) return -1;
		            if(i1.get(i) > i2.get(i)) return 1;
		        }
		        if(i1.size() > i2.size()) return 1;
		        if(i1.size() < i2.size()) return -1;
		        return 0;
		    });
		    System.out.println(ans1);
		return ans1;
		    }

	 
	static void solve(int i, ArrayList<Integer> cur, ArrayList<Integer> A, HashSet<ArrayList<Integer>> ans){
	        if(i==A.size()){
	            ans.add(new ArrayList<>(cur));
	            return;
	        }

	        solve(i+1, cur, A, ans);
	        int e = A.get(i);
	        cur.add(e);
	        solve(i+1, cur, A, ans);
	        cur.remove(cur.size()-1);
	    }
}
