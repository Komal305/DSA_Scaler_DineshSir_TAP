package dSA49QueuesImplementationProblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Test {

	public Test() {
		
	}
	
	public static void main(String[] args) {
		
		int[] A= {1,3,-3,5,4,6,3,7};
		int B=3;
		int n=A.length;
		Deque<Integer> dq = new ArrayDeque<>();
		for(int i=0; i<B; i++) {
			while(!dq.isEmpty() && A[dq.getLast()]<=A[i]) {
				dq.removeLast();
			}
			dq.add(i);
		System.out.println(A[dq.getFirst()]);
		}
		
		Integer y=9;
		Integer z=91;
		System.out.println(" Integer add");
		System.out.println(y+z);
		int x2=9;
		int x1=91;
		System.out.println(" Int add");
		System.out.println( x1+x2);
		
		for(int i=B; i<n; i++) {
			while(!dq.isEmpty() && A[dq.getLast()]<=A[i]) {
				dq.removeLast();
			}
			dq.add(i);
			if(dq.getFirst()==i-B)
				dq.removeFirst();
			
			System.out.println(A[dq.getFirst()]);
		}
		
	}

}
