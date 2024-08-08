package udemydatastructure.hashtable;

public class SimpleHashTable {
private Books[] hashtable;
public SimpleHashTable() {
	hashtable=new Books[5];
}

private int hashKey(String key)
{
	return key.length()%hashtable.length;
}

public void put(String key, Books book) {
	int hashkey=hashKey(key);
	if(hashtable[hashkey]!=null) 
		System.out.println("sorry not available");
	else
		hashtable[hashkey]=book;
}

public Books get(String key) {
	int hashKey=hashKey(key);
	return hashtable[hashKey];
}

public void printHashTable() {
	for(Books book:hashtable) {
		System.out.println(book);
	}
}
}