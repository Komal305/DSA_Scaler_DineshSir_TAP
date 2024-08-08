package hashing2Problems;

public class Q2CountPairDifference {
public static void main(String[] args) {
	int[] A= {1, 2, 1, 2}; int B=1; int count=0;
	for(int i=0; i<A.length; i++) {
		for(int j=0; j<A.length; j++) {
			if(i!=j) 
			{
				if( B==A[i]-A[j]) count++;
			}
			
			
		}
	}
	System.out.println(count);
}
}
