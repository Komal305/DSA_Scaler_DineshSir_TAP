package javaModularArthmaticGCD;

public class AQ3DivisorGame {

	public static void main(String[] args) {
	int A=12, B=3, C=2;
	int lcm = B*C/gcd(B, C);
	System.out.println(A/lcm);
	}

	static public int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
}
