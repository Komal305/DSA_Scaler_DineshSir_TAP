package TapAcedmy.BitManipulation;

public class addBinary {
public static void main(String[] args) {
	String s1="100";
	String s2="11";
	String s="";
	int carry=0;
	int i=s1.length()-1;
	int j=s2.length()-1;
	
	while(i>=0||j>=0||carry==1) {
		int sum=carry;
		if(i>=0) {
			sum =sum+s1.charAt(i--)-'0';
		
		}
		if(j>=0) {
			sum =sum+s2.charAt(j--)-'0';
		
		}
		s=sum%2+s;
		carry=sum/2;
		
		
	}
	System.out.println(s);
}
}
