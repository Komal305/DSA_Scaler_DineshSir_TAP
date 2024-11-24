package dsa59_Heaps2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class Q1KPlacesApart {

	public static void main(String[] args) {
		
		int[] A= {1,40,2,3};
		int B=2, n=A.length, i=0, j=0;
		//always smallest element will be on top min heap 
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(i=0; i<=Math.min(n-1, B);  i++) {
			pq.offer(A[i]);
		}
		
		while(i<n) {
			A[j]=pq.poll();
			
			pq.offer(A[i]);
			i++; j++;
		}
	
		while(j<n) {
			A[j]=pq.poll();
			
			j++;
		}
		
		System.out.println(Arrays.toString(A));
	//Arrays.stream(A).forEach(System.out::print);
	}

}
