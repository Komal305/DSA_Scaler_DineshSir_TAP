package udemydatastructure.stack;

public class LinkedStackMain {
	
	public static void main(String[] args) {
		
	
	Books book1=new Books("The secret","rohnda byrne",500.5);
	Books book2=new Books("I am malala","malala",600.05);
	Books book3=new Books("head first java","sierra",1200.00);
	Books book4=new Books("Data Structure & Algorithm","rechard",3900.00);
	Books book5=new Books("head first java5","sierra",1200.00);
	
	LinkedStack l=new LinkedStack();
	l.push(book1);
	l.push(book2);
	l.push(book3);
	l.push(book4);
	l.push(book5);
	l.push(book5);//duplicates Are allowed
	
	l.printStack();
	System.out.println("__________before peek_____________");
	System.out.println(l.peek());
	System.out.println("__________after peek_____________");
	l.printStack();
	//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	System.out.println("__________before pop_____________");
	System.out.println(l.pop());
	System.out.println("__________after pop_____________");
	l.printStack();
	
	
}
}