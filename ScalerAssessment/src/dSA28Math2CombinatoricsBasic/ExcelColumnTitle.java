package dSA28Math2CombinatoricsBasic;

public class ExcelColumnTitle {

	public static void main(String[] args) {
	int A=55;
	System.out.println(convertToTitle(A));

	}
	static public String convertToTitle(int A) {
	       String s="";
	       while(A>0){
	           A=A-1;
	           s=(char)(A%26 + 'A')+s;
	           A/=26;
	       }
	return s;
	    }
}
