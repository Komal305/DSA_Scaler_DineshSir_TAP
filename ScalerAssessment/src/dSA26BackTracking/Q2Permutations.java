package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q2Permutations {

	public static void main(String[] args) {
		
		
		 ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3)); 
				 ArrayList<ArrayList<Integer>> ans=new ArrayList<>() ;
		        
		            permuteList(A,0,ans);
		           System.out.print(ans);
		    }
	
	static public void permuteList(ArrayList<Integer> A, int start, ArrayList<ArrayList<Integer>> ans)
	{
	if(start==A.size()){
		ans.add(new ArrayList<>(A));
	    return;
	}
	for(int i=start; i<A.size(); i++){
	    Collections.swap(A, start,i);
	    permuteList(A,start+1,ans);
	    Collections.swap(A, start, i);
	}
	}

		
	}


