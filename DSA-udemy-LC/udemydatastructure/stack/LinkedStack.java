package udemydatastructure.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack 
{
private LinkedList<Books> stack;
 
public LinkedStack() {
	stack =new LinkedList<Books>();
}

public void push(Books book) {
	stack.push(book);
}
public Books pop() {
	return stack.pop();
}

public Books peek() {
	return stack.peek();
}

public boolean isEmpty() {
	return stack.isEmpty();
}


public void printStack() {
	ListIterator<Books> itr= stack.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
