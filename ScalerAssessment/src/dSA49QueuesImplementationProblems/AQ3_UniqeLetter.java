package dSA49QueuesImplementationProblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AQ3_UniqeLetter {

	public static void main(String[] args) {
		String A = "abadbc";
	
		Map<Character,Integer> m = new HashMap<>();
		Queue<Character> q = new LinkedList<Character>();
		StringBuffer ans = new StringBuffer();
		
		for(char c : A.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);//(a,1)(b,1)(a,2)(d,1)(b,2)(c,1)
			q.add(c);//a,b,a//badb//adb//dbc
			
			while( !q.isEmpty() && m.get(q.peek())>1)//%% a>1 b>1
				System.out.println(q.poll());
			//	q.poll();//a b a
			
			if(!q.isEmpty()) ans.append(q.peek());//aabbdd
			else ans.append("#");
		}
		
		System.out.println(ans.toString());
	}
}
