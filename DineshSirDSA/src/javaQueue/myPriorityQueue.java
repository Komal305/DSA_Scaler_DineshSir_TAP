package javaQueue;

import java.util.PriorityQueue;

public class myPriorityQueue {

	
	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<>();
		p.offer(1);
		p.offer(2);
		p.offer(5);
		p.offer(4);
		p.offer(3);
		
		System.out.println(p.size());
//		System.out.println(p.poll());
//		System.out.println(p.peek());
	}

}
