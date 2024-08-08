package udemydatastructure.stack;

import java.util.EmptyStackException;

public class ArrayStack {

	private Books[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		stack=new Books[capacity];
	}
	
	public void push(Books book) {
		if(top==stack.length) {
			Books[] newArray=new Books[2*stack.length];
			System.arraycopy(book, 0, newArray, 0, stack.length);
			stack=newArray;
		}
		stack[top++] = book;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public Books pop() {
		if(isEmpty()) 
			throw new EmptyStackException();
		
		Books book=stack[--top];
		stack[top]=null;
		return book;
	}
	
	public Books peek() {
		if(isEmpty()) 
			throw new EmptyStackException();
		
		return stack[top-1];
	}
	
	public void printStack() {
		for(int i=top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
}
