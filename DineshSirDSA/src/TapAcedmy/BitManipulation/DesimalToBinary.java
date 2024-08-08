package TapAcedmy.BitManipulation;

public class DesimalToBinary {
public static void main(String[] args) {
	int n=45;
	
	String b="";
	while(n>=1) {
		int x = n%2;
		n=n/2;
	b= x+b;
	}
	System.out.println(b);
}
}
