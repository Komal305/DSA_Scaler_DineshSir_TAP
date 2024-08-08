package udemydatastructure.hashtable;

public class Books {
String BookName;
String Author;
double price;

public Books(String bookName, String author, double price) {
	super();
	BookName = bookName;
	Author = author;
	this.price = price;
}
public String getBookName() {
	return BookName;
}
public void setBookName(String bookName) {
	BookName = bookName;
}
public String getAuthor() {
	return Author;
}
public void setAuthor(String author) {
	Author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Books [BookName=" + BookName + ", Author=" + Author + ", price=" + price + "]";
}


}