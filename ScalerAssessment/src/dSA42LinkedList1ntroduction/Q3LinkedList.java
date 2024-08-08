package dSA42LinkedList1ntroduction;

import java.util.concurrent.Delayed;

public class Q3LinkedList  {

	public static void main(String[] args) {
		node n=new node();
		n.insertNode(1, 11);
		n.insertNode(2, 12);
		n.insertNode(3, 13);
		n.insertNode(4, 14);
		
		//n.delete(2);
		//n.reverse(n.root);
		n.print();
		

	}

}

 class node{
    int data;
    node next;

    public node(){
        this.data=0;
        this.next=null;
    }

 
 static node root;
 static int size=0;
 
 
 public void insertNode(int position, int value) {
	 if(position>=1 && position<=size+1) {
		 node temp = new node();
		 temp.data=value;
		 if(position==1) {	 
			 temp.next=root;
			 root=temp;
		 }else {
			 int count=1;
			 node pre=root;
			 while(count < position-1) {
				 pre=pre.next;
				 count++;
			 }
			 temp.next=pre.next;
			 pre.next=temp;
		 }
			 size++;
	 } 
 }
 
 public void delete(int position) {
	 if(position >= 1 && position <= size)
	 {
		 node temp = null;
		 if(position==1) {
			 temp=root;
			 root=root.next;
		 }else {
			 int count=1;
			 node pre=root;
			 while(count<position-1) {
				pre = pre.next;
				count++;
			 }
			 temp = pre.next;
			 pre.next =pre.next.next;
		 }
		 size--;
	 }
 }
 
 
 public void print() {
	 node temp=root;
	 int flag=0;
	 while(temp != null) {
		 if(flag==0) {
			 System.out.print(temp.data);
			 flag=1;
		 }else {
			 System.out.print(" "+temp.data);
		 }
		 temp= temp.next;
	 }
 }
 
 public node reverserInRange(node n, int a, int b) {
	 node pre=root;
	 
	 
	 
	 return pre;
 }
 
  public node reverse(node n) {
	 if(n==null)return n;
	 
	 node curr=n;
	 node pre=null;
	 node nex=null;
	 
	 while(curr!=null) {
		 nex=curr.next;
		 curr.next=pre;
		 pre=curr;
		 curr=nex;
		 
	 }
	 
	 
	 return pre;
	 
 }
 
 }
 
 
 
