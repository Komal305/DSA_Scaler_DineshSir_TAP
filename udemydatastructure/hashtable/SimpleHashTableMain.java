package udemydatastructure.hashtable;


public class SimpleHashTableMain {
public static void main(String[] args) {

	Books book1=new Books("The secret","rohnda byrne",500.5);
	Books book2=new Books("I am malala","malala",600.05);
	Books book3=new Books("head first java","sierra",1200.00);
	Books book4=new Books("Data Structure & Algorithm","rechard",3900.00);
	Books book5=new Books("head first java5","sierra",1200.00);
	
	SimpleHashTable hashtable=new SimpleHashTable();
	hashtable.put("rohnda", book1);
	//hashtable.put("rohnda", book1);//dulicates are allowed
	hashtable.put("mala", book2);
	hashtable.put("sie", book3);
	hashtable.put("rechard", book4);
	//hashtable.put("sierra", book5);
	
	//hashtable.printHashTable();
	
	System.out.println(hashtable.get("sie"));
	hashtable.get("rohnda");
}
}
