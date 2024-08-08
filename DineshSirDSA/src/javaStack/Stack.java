package javaStack;

import java.util.EmptyStackException;

public class Stack{
private ListNode top;
private int length;
	public static void main(String[] args) {
		Stack s=new Stack();
//		s.push(5);
//		s.push(30);
//		s.push(20);
//		s.push(10);
//		s.push(55);
	s.printStack();
		
		
		//System.out.println("length:-"+s.length());
//System.out.println("empty? "+s.empty());
//System.out.println("peep " +s.peek());
//System.out.println("pop "+s.pop());

//System.out.println(s.search(38));
	}
public int length() {
	return length;
}

public Stack(){
    top=null;
	length=0;
}

public boolean empty() {
	return (length==0)?true:false;
}

//Removes and returns the top element of the stack
public int pop() {
	
	if(empty()) throw new EmptyStackException();
	
	int temp=top.data;
	top=top.next;
	length--;
	return temp;	
}

//Returns the element on the top of the stack, but does not remove it
public int peek() {
	if(empty()) throw new EmptyStackException();
return top.data;	
}

public void push(int data) {
	ListNode temp=new ListNode(data);
temp.next=top;
 top=temp;
	length++;	
}

public boolean search(int data) {
	ListNode temp=top;
	while(temp!=null) {
		
		if(temp.data==data)
		return true;
		temp=temp.next;
	}
	return false;
}

public void printStack(){
	if(empty()) System.out.println("null");
	ListNode temp=top;
	while(temp!=null) {
		System.out.println(temp.data+"^");
		temp=temp.next;
	}
}
}

class ListNode{
	int data;
	ListNode next;
	public ListNode(int data)
	{
		this.data=data;
		this.next=null;
	} 
		
}