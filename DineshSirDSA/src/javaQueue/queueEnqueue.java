package javaQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueEnqueue {

public static void main(String[] args) {
	Queue<Integer> q=new LinkedList<>();
	q.add(12);
	System.out.println(queueEnqueue.rear(q));
	System.out.println(queueEnqueue.isEmpty(q));
    
}

public static int rear(Queue<Integer> myQueue)
{
    if (myQueue.isEmpty()) {
        System.out.println("Queue is empty.");
        return -1;
    }

    int rearElement = -1;
        rearElement = myQueue.poll();
    

    return rearElement;
}


PriorityQueue<Integer> p=new PriorityQueue<>();
ArrayDeque<Integer> a= new ArrayDeque<>();

static boolean isEmpty(Queue q) {
	//return (q.element()==null)?true:false;//Exception in thread 
	return (q.poll()==null)?true:false;//true
}

}