package udemydatastructure.queue;

public class ArrayQueueMain {
	
	
	public static void main(String[] args) {
		
		
		Books book1=new Books("The secret","rohnda byrne",500.5);
		Books book2=new Books("I am malala","malala",600.05);
		Books book3=new Books("head first java","sierra",1200.00);
		Books book4=new Books("Data Structure & Algorithm","rechard",3900.00);
		Books book5=new Books("head first java5","sierra",1200.00);
		
		ArrayQueue a=new ArrayQueue(5);
		a.add(book1);
		a.add(book2);
		a.add(book3);
		a.add(book4);
		a.add(book5);
		//a.add(book2);
		
		
//		System.out.println("_______________peek______________");
//		System.out.println(a.peek());
//		System.out.println("_______________after peek______________");
//		a.printQueue();
		
		System.out.println("_______________remove______________");
		System.out.println(a.remove());
		System.out.println("_______________after remove______________");
		a.printQueue();
		System.out.println("size of stack "+ a.size());
		//System.out.println(""+a.);
		
	}

}
