package udemydatastructure.queue;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private Books[] queue;
	private int front;
	private int back;
	
	public ArrayQueue(int capacity) {
		queue=new Books[capacity];
	}
	
public void	add(Books book) throws NoSuchElementException {
	if(back==queue.length) {
		Books[] newArray=new Books[2*queue.length];
		System.arraycopy(book, 0, newArray, 0, queue.length);
		newArray=queue;
	}
	
	queue[back]=book;
	back++;
}

public int size() {
	return back-front;
}

public Books remove() {
	if(size()==0) {
		throw new NoSuchElementException("you don't have any books to remove better now buy some!!");
	}
	
	Books books=queue[front];
	queue[front]=null;
	front++;
	
	if(size()==0) {
		front=0;
		back=0;
	}
	return books;
}

public Books peek() {
	if(size()==0) {
		throw new NoSuchElementException("nothing is there to peek");
	}
	
	return queue[front];
}

public void printQueue() {
	for(int i=front;i<back;i++) {
		System.out.println(queue[i]);
	}
}

}
