package javaRecursion;

public class Print1toAfunction {
public static void main(String[] args) {
	print(10);//1 2 3 4 5 6 7 8 9 10 
//with space
    System.out.println();
}
public static void print(int A) {
if(A==0) { return;}
      print(A-1);
        System.out.print(A+" ");
    }
}
