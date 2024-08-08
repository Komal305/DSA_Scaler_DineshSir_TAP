package dsa59Heaps2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q3RunningMedian {

	private PriorityQueue<Integer> max;
	private PriorityQueue<Integer> min;
	
	public Q3RunningMedian() {
		max=new PriorityQueue<>(Collections.reverseOrder());
		min=new PriorityQueue<>();
	}

	public  static void main(String[] args) {
		int[] A= {1,2,5,4,3};
		 Q3RunningMedian medianFinder = new Q3RunningMedian();
		 medianFinder.solve(A);
		
		
	}
	
	public void solve(int[] A) {
		List<Integer> median = new ArrayList<>();
		for(int n:A) {
			addNumber(n);
			median.add(getMedian());
		}
	for(int m: median) System.out.print(m);
	}
	
	
	private  Integer getMedian() {
	if(max.size() >= min.size()) return max.peek();
	else
		return min.peek();
	}

	private  void addNumber(int n) {
		max.offer(n);
 System.out.println(max);
	System.out.println(min);
		
		if( !max.isEmpty() && !min.isEmpty()  && max.peek() > min.peek()) 
			min.offer(max.poll());
		
		if(max.size() > min.size()+1) min.offer(max.poll());
		else if(min.size() > max.size()) max.offer(min.poll());	
	}
	
}
