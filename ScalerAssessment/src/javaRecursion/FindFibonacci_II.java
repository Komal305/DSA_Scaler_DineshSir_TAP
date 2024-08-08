package javaRecursion;

public class FindFibonacci_II {
public static void main(String[] args) {
	int A=9;
	System.out.println(findAthFibonacci(A));
	;
}
public static int findAthFibonacci(int A) {
    if(A==0) return 0;
    if(A==1) return 1;
    return findAthFibonacci(A-1)+findAthFibonacci(A-2);
}
}
