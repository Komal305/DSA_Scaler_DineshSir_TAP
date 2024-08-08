package TapAcedmy.BitManipulation;

public class Test {
public static void main(String[] args) {
	String s="1101"; int num=0; int p2=1;
	for(int i=s.length()-1;i>=0;i--) {
		if(s.charAt(i)=='1')
			num += p2;
		p2 = p2*2;
	}
	
	
	
//	String s=""; int n =13;
//	while(n>0) {
//	s =(n%2==1)?1+s:0+s;
//	n/=2;
//	}
	System.out.println(num);
}
}
