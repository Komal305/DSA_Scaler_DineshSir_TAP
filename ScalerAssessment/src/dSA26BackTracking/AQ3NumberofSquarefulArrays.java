package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AQ3NumberofSquarefulArrays 
{
	public static void main(String[] args) 
	{
//		ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,17,8));
//		 if(A.size()==1) return;
//		 
//	        Collections.sort(A);//(1,8,17)
//	        System.out.println(A);
//	        Set<List<Integer>> ans=new HashSet<>();
//	        backtrack(A, new ArrayList<>(), new boolean[A.size()], ans);
//	       // return ans.size();
//		
////System.out.println(ans.size());
//	}
//	static void backtrack(ArrayList<Integer> A, List<Integer> c, boolean[] used, Set<List<Integer>> ans){
//		System.out.println(c.size()+" "+A.size());
//		if(c.size()==A.size()){//0!=3 , 1!=3, 2!=3, 3==3, 2!=3, 3==3
//            if(isSquare(c)) 
//            	ans.add(new ArrayList<>(c));//ans=1,{1,8},
//            return;
//        }
//		
//        for(int i=0; i< A.size(); i++){
//        	//System.out.println(used[i]+"  i="+ i);
//           if(used[i])//F, T, T, F,F
//        	   continue;
//
//            if(i>0 && A.get(i) == A.get(i-1) && !used[i-1]) continue;    
//		
//		            used[i]=true;
//		            c.add(A.get(i));//c={1},{1},{1,8,17},
//		          //  System.out.println(c);
//		            backtrack(A, c, used, ans);
//		            used[i]=false;
//		             c.remove(c.size()-1);//3-1=2,2-1=1,
//		        }
//		    }
//	
//	static boolean isSquare(List<Integer> p){
//        for(int i=0; i<p.size()-1; i++){
//            int sum =p.get(i) + p.get(i+1);
//            if(!isPerfectSquare(sum)) return false;
//        }
//        return true;
//    }
//	
//	static boolean isPerfectSquare(int n){
//        int sqrt=(int) Math.sqrt(n);
//        return sqrt*sqrt==n;
//    }
//}

//public class Solution {
    
    int[] A= {1,17,8};
        HashMap < Integer, Integer > count = new HashMap < > ();
        int N = A.length;
        for (int i = 0; i < N; i++) {
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
        }
        
        System.out.println(count);
        
        
        
        HashMap < Integer, HashSet < Integer >> graph = new HashMap < > ();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isPerfectSquare(A[i] + A[j])) {
                    // add an edge from i to j and j to i
                    HashSet < Integer > set = graph.getOrDefault(A[i], new HashSet < Integer > ());
                 //   System.out.println(set);
                    if (!set.contains(A[j])) {
                        set.add(A[j]);//8
                        graph.put(A[i], set);//1==8
                    }
                    set = graph.getOrDefault(A[j], new HashSet < Integer > ());
                  // 
                    if (!set.contains(A[i])) {
                        set.add(A[i]);
                        graph.put(A[j], set);
                    }
                    
                    System.out.println(set);
                }
            }
        }
        ArrayList < ArrayList < Integer >> res = new ArrayList < > ();
        for (int i: count.keySet()) {
            backtrack(graph, count, N, i, new ArrayList < Integer > (), res);
        }
      //  return res.size();
      //  System.out.println(res.size());
    }

    public static void backtrack(HashMap < Integer, HashSet < Integer >> graph, Map < Integer, Integer > count, int N, int value,
        List < Integer > temp, ArrayList < ArrayList < Integer >> res) {
        if (count.get(value) == 0)
            return;
        if (!graph.containsKey(value))
            return;
        count.put(value, count.get(value) - 1);
        temp.add(value);
        if (temp.size() == N) {
            res.add(new ArrayList < Integer > (temp));
        } else {
            for (int i: graph.get(value)) {
                // traverse all adjacent vertices
                backtrack(graph, count, N, i, temp, res);
            }
        }
        temp.remove(temp.size() - 1);
        count.put(value, count.get(value) + 1);
    }
    
    static boolean isPerfectSquare(int n) {
        int m = (int) Math.sqrt(n) - 2;
        while (1L * m * m < n) m++;
        return m * m == n;
    }
}
