package javaRecursion;

public class PrintAto1functionAP {

	public static void main(String[] args) {
	solve(5);//5 4 3 2 1 
	//with space
	}
	public static void solve(int A) {
        if(A==0){System.out.println(); return;}
        System.out.print(A+" ");
         solve(A-1);
    }

}
