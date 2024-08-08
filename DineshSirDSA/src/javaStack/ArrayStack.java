package javaStack;


public class ArrayStack {
private int top;
private int[] arr;
	public ArrayStack(int capacity) {
		top=-1;
		arr=new int[capacity];
	}
	
	public ArrayStack() {
		this(10);
	}

	public static void main(String[] args) {
		ArrayStack s=new ArrayStack(3);
		s.push(5);
		s.push(15);
		s.push(55);

		s.printStack();
		//System.out.println(s.peek());
		System.out.println();
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.printStack();
	}
	private boolean isFull() {
		return arr.length==size();
	}
	private boolean isEmpty() {
		return top==-1;
	}
	private int size() {
		return top+1;
	}
	
	private void push(int data) {
		if(isFull())
			throw new RuntimeException("stack is full");
		top++;
		arr[top]=data;
	}
	
	private int pop() {
		if(isEmpty())
			throw new RuntimeException("stack is full");
		
		return arr[top--];
		
	}
	
	private int peek() {
		if(isEmpty())
			throw new RuntimeException("stack is full");
		
		return arr[top];
	}
	
	public void printStack(){
		if(isEmpty()) System.out.println("null");
		else
		{
			for(int i=0; i<=top; i++)
			System.out.print(arr[i]+"^");
		
		}
	}

}
