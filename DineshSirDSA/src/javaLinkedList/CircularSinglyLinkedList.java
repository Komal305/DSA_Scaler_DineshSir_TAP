package javaLinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	ListNode last;
	private int length;
	private class ListNode{
		private ListNode next;
		private int data;
		 public ListNode(int data) {
			 this.data=data;
		 }
	}
	
	public CircularSinglyLinkedList() {
		last=null;
		length=0;
	}
	public int length() {
		return length;
	}
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularLinkedList() {
		ListNode  n1 =new ListNode(1);
		ListNode  n2 =new ListNode(3);
		ListNode  n3 =new ListNode(6);
		ListNode  n4 =new ListNode(9);
		ListNode  n5 =new ListNode(12);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n1;
		last=n5;
		length++;
	}
	public static void main(String[] args) {
		CircularSinglyLinkedList csll=new CircularSinglyLinkedList();
		
		
		csll.createCircularLinkedList();
		System.out.println(csll.isEmpty());
		//csll.insertNodeAtFirst(30);
		//csll.insertNodeAtLast(7);
		//csll.removeFirstNode();
		//csll.removeLastNode();
		System.out.println(csll.removeLastNode());
		csll.PrintCircularLinkedList();
	}
	
	public void PrintCircularLinkedList() {
		if(last==null) return;
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+"<->");
			first=first.next;
		}
		System.out.print(first.data+"<->");
	}
	
	public void insertNodeAtFirst(int data) {
		
		ListNode newNode=new ListNode(data);
		if(last==null)last=newNode;
		else
			newNode.next=last.next;
		last.next=newNode;
		length++;
		
	}

public void insertNodeAtLast(int data) {
		ListNode newNode=new ListNode(data);	
		if(last==null) {
			last=newNode;
			last.next=last;
		}
		else {
			newNode.next=last.next;
			last.next=newNode;
			last=newNode;
		}	
		length++;
	}

public ListNode removeFirstNode() {
	if(isEmpty())throw new NoSuchElementException();
	ListNode temp=last.next;
	if(last.next==last) {
		last=null;
	}else {
		last.next=temp.next;
	}
	temp.next=null;
	length--;
	return temp;
}

public ListNode removeLastNode() {
	if(isEmpty())throw new NoSuchElementException();
	
	if(last.next==last)
		last=null;
		
		ListNode temp=last.next;
	while(temp.next!=last) {
		temp=temp.next;
	}
	temp.next=last.next;
	last=temp;
		
	length--;
return temp;
}


}