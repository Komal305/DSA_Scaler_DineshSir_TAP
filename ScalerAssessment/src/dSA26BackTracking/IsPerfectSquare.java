package dSA26BackTracking;

public class IsPerfectSquare {

	public static void main(String[] args) {
		int n=25;
		int m=(int) Math.sqrt(n)-2;
		System.out.println(m);
		while(m*m<n) m++;
		
		if(m*m==n) System.out.println("yes");
		else System.out.println("ella");

	}

}
