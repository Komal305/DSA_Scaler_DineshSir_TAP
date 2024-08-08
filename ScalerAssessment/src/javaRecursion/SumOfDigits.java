package javaRecursion;

public class SumOfDigits {
public static void main(String[] args) {
	System.out.println(sum(123));//6
}
public static int sum(int A) {
	if(A==0) return 0;
	return (A%10)+sum(A/10);
}
}
