package udemydatastructure.stack;

public class ArrayStackMain {
	public static void main(String[] args) {
		ArrayStack s=new ArrayStack(5);
		s.push(new Books("The secret","rohnda byrne",500.5));
		s.push(new Books("The magic","rohnda byrne",505.5));
		s.push(new Books("I am malala","malala",600.05));
		s.push(new Books("head first java","sierra",1200.00));
		s.push(new Books("Data Structure & Algorithm","rechard",3900.00));
		
		System.out.println("peek befor pop "+s.peek());
		System.out.println("__________________________________________");
		System.out.println("poped "+s.pop());
		System.out.println("__________________________________________");
		System.out.println("peek after pop  "+s.peek());
	}

}
