package javaRecursion;

public class FindFactorial {
public static void main(String[] args) {
	System.out.println(factorial(4));//24
}

public static int factorial(int A) {
    if(A==0) return 1;
    return A*factorial(A-1);
}

}
