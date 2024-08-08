package TapAcedmy.BitManipulation;

public class solve {
static int k;
	public static void main(String[] args) {
		//pow(2, 2, 3);
		//System.out.println();
	}
	public  void pow(int x, int n, int d) {
		solve.k=9;
		k=9;
	    long a = x;
	    long res = 1L;
	    while (n > 0) {
	        if (n % 2 == 1) {
	            res *= a;
	            res %= d;
	            //System.out.println();
	        }
	        a *= a;
	        a %= d;
	        n = n >> 1;
	        //System.out.println();
	    }
	    res = (res + d) % d;
	    //return (int) res;
	    System.out.println((int)res);
	}


}
