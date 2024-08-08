package javaLinkedList;

public class SinglyLinkedList {
private ListNode head;

public static class ListNode{
	public int data;
	public ListNode next;
	
	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}
public static void main(String[] args) {
	SinglyLinkedList n1=new SinglyLinkedList();
	n1.head=new ListNode(1);
	ListNode n2=new ListNode(3);
	ListNode n3=new ListNode(5);
	ListNode n4=new ListNode(7);
	ListNode n5=new ListNode(9);
	
	n1.head.next=n2; 
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	
//	ListNode a1=new ListNode(1);
//	ListNode a2=new ListNode(3);
//	ListNode a3=new ListNode(5);
//	ListNode a4=new ListNode(7);
//	ListNode a5=new ListNode(9);
//	
//	a1.next=a2; 
//	a2.next=a3;
//	a3.next=a4;
//	a4.next=a5;
//	
//	ListNode b1=new ListNode(1);
//	ListNode b2=new ListNode(4);
//	ListNode b3=new ListNode(5);
//	ListNode b4=new ListNode(8);
//	ListNode b5=new ListNode(10);
//	
//	b1.next=b2;
//	b2.next=b3;
//	b3.next=b4;
//	b4.next=b5;
//	
//	ListNode m = n1.mergeList(b1, a1);
//	while(m!=null) {
//		System.out.print(m.data+"->");
//		m=m.next;
//	}
 //n1.printHead();
//	n1.length();
//	n1.insertHead(9);
//	n1.length();
//	n1.insertEnd(4);
//	n1.length();
//	n1.insertNode(99, 3);
	//System.out.println(n1.deleteFirst().data);
	//System.out.println(n1.deleteLast().data);
//l1.deleteNode(2);
// System.out.println(n1.searchElement(3));
// ListNode rev=n1.reverse(n1.head);
 
 //ListNode rev=n1.reverseBetween(n1.head, 2, 4);
 
// ListNode mid=n1.middleNode();
// System.out.println(mid.data);
	//n1.print(mid);
 //ListNode nth=n1.nthEndNode(6);
//n1.removeDuplicate();
//n1.insertNodeInSorted(4);
//n1.deleteKey(5);
//n1.createLoopInLinkedList();
//System.out.println(n1.CheckLoop());
//System.out.println(n1.StartNodeOfLoop().data);
//n1.removeLoop();
//System.out.println(n1.CheckLoop());
	n1.print();
	System.out.println(n1.middleNode().data);
}
// ====================================================print================================================================
public void print(){
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+">-");
		current=current.next;
	}
	System.out.println("null");
}

public void printHead(ListNode head){
	ListNode current=head;
	while(current!=null) {
		System.out.print(current.data+">-");
		current=current.next;
	}
	System.out.println("null");
}
//====================================================length================================================================
public int length(){
	if(head==null) {
		return -1;
	}
	int count=0;
	ListNode current=head;
	while(current!=null) {
		count++;
		current=current.next;
	}
	System.out.println(count);
	return count;
}
//====================================================insert===============================================================
public void insertHead(int value) {
	ListNode newNode=new ListNode(value);
	newNode.next=head;
	head=newNode;
}

//=========================tail======================================
ListNode findTail(ListNode A){
    ListNode tail=A;
    ListNode curr=A;
    while(curr.next!=null){
        tail=tail.next;
        curr=curr.next;
    }

return tail;
}
//================================================================

public void insertEnd(int value) {
	ListNode newNode=new ListNode(value);
	if(head==null) {
		newNode=head;
		return;
	}
	ListNode current = head;
	while(null!=current.next) {
		current=current.next;
	}
	current.next=newNode;
}

public void insertNode(int data,int position) {
	ListNode node=new ListNode(data);
	if(position==1) {
		node.next=head;
		head=node;
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		node.next=current;
		previous.next=node;
	}
}
//====================================================delete================================================================
public ListNode deleteFirst() {
	if(head==null) {
		return null;
	}
	ListNode temp=head;
    head=head.next;
	temp.next=null;
	return temp;
}

public ListNode deleteLast() {
	if(head==null) {
		return null;
	}
	 ListNode current=head;
	ListNode previous =null;
		while(current.next!=null) {
			previous =current;
			current=current.next;
		}		
previous.next=null;
		
	return current;
}

public void deleteNode(int position) {
	if(position==1) {
		head=head.next;
	}else {
		ListNode previous=head;
		int count=1;
		while(count<position-1) {
			previous=previous.next;
			count++;
		}
		ListNode current=previous.next;
		previous.next=current.next;
	}
}
//====================================================search================================================================
public boolean searchElement(int key) {
	ListNode current=head;
	while(current!=null) {
		if(current.data==key)
			return true;
		
		current=current.next;
	}
	
	return false;
}
//====================================================reverse================================================================
public ListNode reverse(ListNode head) {
	if(head==null) return head;
	
    ListNode current=head;
    ListNode previous=null;
    ListNode next=null;
    while(current!=null){
        next=current.next;
        current.next=previous; 
        previous=current;
        current=next;
    }
    return previous;
}

public ListNode reverseBetween(ListNode head, int left, int right) {
	if(head==null) return head;
	
    ListNode current=head.next;
    ListNode previous=null;
    ListNode next=null;
    while(left<=right){
        next=current.next;
        current.next=previous; 
        previous=current;
        current=next;
    }
    return previous;
}
//====================================================middle node================================================================
public ListNode middleNode() {
	
	ListNode slowPtr=head;
	ListNode fastPtr=head;
	while(fastPtr!=null && fastPtr.next!=null) {
		slowPtr=slowPtr.next;
		fastPtr=fastPtr.next.next;
		
	}	
	return slowPtr;
}
//====================================================nth node================================================================
public ListNode nthEndNode(int n) {
	if(head==null)return null;

	if(n<=0) throw new IllegalArgumentException(n+" invalid number ");
	
	int count=0;
	ListNode ref=head;
	ListNode main=head;
	while(count<n) {
		if(ref==null) throw new IllegalArgumentException(n+" is grater than the number of node ");
		ref=ref.next;
		count++;
	}
	while(ref!=null) {
		ref=ref.next;
		main=main.next;
	}
	
	return main;

}
//====================================================remove duplicate from sorted list ================================================================
public void removeDuplicate() {
	ListNode current =head;
	while(current!=null && current.next!=null) {
		if(current.data==current.next.data) {
			current.next=current.next.next;
		}else {
			current=current.next;
		}
	}
}

//====================================================insert node sorted list ======================
public ListNode insertNodeInSorted(int n) {
	ListNode newNode=new ListNode(n);
	if(head==null) return newNode;
	ListNode current=head;
	ListNode pre=null;
	while(current != null) {
		if(current.data < n && current.next.data > n) {
			pre=current.next;
			current.next=newNode;
			newNode.next=pre;
		}else {
			current=current.next;
		}
			
		}
	return head;
	}

//====================================================delete key======================
public void deleteKey(int key) {
ListNode current=head;
ListNode temp=null;
if(current!=null && current.data==key) {
	head=current.next;return;
}

while(current!=null && current.data!=key) {
	temp=current;
   current=current.next;
} 

if(current == null)return;

temp.next=current.next;

}
//===========================================create loop list ===============================
public void createLoopInLinkedList() {
	ListNode n1=new ListNode(1);
	ListNode n2=new ListNode(2);
	ListNode n3=new ListNode(3);
	ListNode n4=new ListNode(5);
	ListNode n5=new ListNode(6);
	head=n1;
	n1.next=n2; 
	n2.next=n3;
	n3.next=n4;
	n4.next=n5;
	n5.next=n3;
}
//===========================================check loop list ===============================
public boolean CheckLoop() {
	ListNode fptr=head;
	ListNode sptr=head;
	while(fptr !=null && fptr.next!=null) {
		sptr=sptr.next;
		fptr=fptr.next.next;
		if(sptr==fptr) {
			return true;
		}
	}
		return false;
	}

//===========================================check start node in loop list ===============================

public ListNode StartNodeOfLoop() {
	ListNode fptr=head;
	ListNode sptr=head;
	while(fptr !=null && fptr.next!=null) {
		sptr=sptr.next;
		fptr=fptr.next.next;
		if(sptr==fptr) {
			return getStartingNode(sptr);
		}
	}
		return null;

}
private ListNode getStartingNode(ListNode sptr) {
	ListNode temp=head;
	while(temp!=sptr) {
		temp=temp.next;
		sptr=sptr.next;
	}
	return temp;
}
//===========================================remove loop ===============================
public void removeLoop() {
	ListNode fptr=head;
	ListNode sptr=head;
	while(fptr!=null && fptr.next!=null) {
		sptr=sptr.next;
		fptr=fptr.next.next;
		if(sptr==fptr) {
			remove(sptr);
			return;
		}
	}
}
public void remove(ListNode slowptr) {
	ListNode temp=head;
	while(slowptr.next!=temp.next) {
		temp=temp.next;
		slowptr=slowptr.next;
	}
	slowptr.next=null;
}

public ListNode mergeList(ListNode a,ListNode b){
	if(a==null) return b; if(b==null) return a;
	
	ListNode dummy=new ListNode(0);
	ListNode tail=dummy;
	
	while(a.next!=null && b.next!=null) {
		if(a.data<b.data) {
			tail.next=a;
			a=a.next;
		}
		else {
			tail.next=b;
			b=b.next;
		}
		tail=tail.next;
	}
	if(a==null) 
		tail.next=b;
	else 
		tail.next=a;
	
	
	return dummy.next;
	
}
}

//////////////////////////
