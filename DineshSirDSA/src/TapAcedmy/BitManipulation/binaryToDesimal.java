package TapAcedmy.BitManipulation;

public class binaryToDesimal {
public static void main(String[] args) {
	String s= "101101";
	
	int num=0;
	int pow2=1;
	for(int i=s.length()-1; i>=0; i--) {
		if(s.charAt(i)=='1') {
			num = num+pow2;
		}
		pow2 = pow2 * 2;
	}
	System.out.println(num);
}

}
