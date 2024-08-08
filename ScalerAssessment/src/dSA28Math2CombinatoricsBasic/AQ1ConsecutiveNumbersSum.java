package dSA28Math2CombinatoricsBasic;

public class AQ1ConsecutiveNumbersSum {

	public static void main(String[] args) {
		int A=10;
		int count=0; long l=2l*A;

		for(int i=1; i*(i-1)<l; i++) {
System.out.println((l-i*(i-1))%(2*i));
			if((l-i*(i-1))%(2*i)==0)
			count++;
		}
//System.out.println(count);
	}

}
