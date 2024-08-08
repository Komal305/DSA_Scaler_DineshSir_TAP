package dSA28Math2CombinatoricsBasic;

public class PascalTrangle {
public static void main(String[] args) {
	int A=5;
//	pascal(A);
//}
//	
//	public static  void pascal(int A) {
    int[][] ncr=new int[A][A];
    for(int i=0; i<A; i++){
    	ncr[i][0]=1;
    	ncr[i][i]=1;
        for(int j=1; j<=i; j++){
            ncr[i][j]=ncr[i-1][j]+ncr[i-1][j-1];
        }
    }
    for(int[] a:ncr) {
    	for(int aa:a)System.out.print(aa+" ");
    	System.out.println();
    }
}
}
