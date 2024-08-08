package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Q3Subset {
static	ArrayList < ArrayList < Integer >> ans;
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,2,3)); 
		subsets(A);
	}  
	    
	    static public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
	        Collections.sort(A);
	        ans = new ArrayList<>();
	        ArrayList<Integer> cur = new ArrayList<>();
	        solve(0, cur, A);
	        // sort the list of list
	        Collections.sort(ans, (ArrayList<Integer> first, ArrayList<Integer> second) -> {
	            for (int i = 0; i < first.size() && i < second.size(); i++) {
	                if (first.get(i) < second.get(i))
	                    return -1;
	                if (first.get(i) > second.get(i))
	                    return 1;
	            }
	            return (first.size() > second.size())? 1:-1;
	        });
	        

	        
	        ans = (ArrayList<ArrayList<Integer>>) ans.stream()
	                .sorted((first, second) -> {
	                    int minLength = Math.min(first.size(), second.size());
	                    for (int i = 0; i < minLength; i++) {
	                        int cmp = Integer.compare(first.get(i), second.get(i));
	                        if (cmp != 0) {
	                            return cmp;
	                        }
	                    }
	                    return Integer.compare(first.size(), second.size());
	                })
	                .collect(Collectors.toList());

	        System.out.println(ans);
	        return ans;
	    }
	
	    static void solve(int idx, ArrayList <Integer> cur, ArrayList <Integer> A) {
	        if (idx == A.size()) {
	            ans.add(new ArrayList<>(cur));
	            return;
	        }
	        solve(idx + 1, cur, A); // not take
	        int element = A.get(idx);
	        cur.add(element); // DO
	        solve(idx + 1, cur, A); // take
	       cur.remove(cur.size() - 1); // UNDO
	    }
	}
/*Given a set of distinct integers A, return all possible subsets.

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The initial list is not necessarily sorted.


Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX


Input Format
First and only argument of input contains a single integer array A.



Output Format
Return a vector of vectors denoting the answer.



Example Input
Input 1:

A = [1]
Input 2:

A = [1, 2, 3]


Example Output
Output 1:

[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]

*/

