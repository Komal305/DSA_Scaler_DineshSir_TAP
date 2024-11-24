package dSA58_Heap1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AQ1_maxSumB {
public static void main(String[] args) {
	List<Integer> A = Arrays.asList(24, -68, -29, -9, 84);
	int B=4;
	
	 Collections.sort(A);
	 int n = A.size();
	 int sum = 0;
	         for(int i=0; i<n; i++) {
	         int ans= -A.get(i);
	         if(i==B) {
	         sum += A.get(i);
	         System.out.println( n+"----"+B);
	         }
	         else {
	        	 
	             sum += ans;
	         }
	         
	         System.out.println(A.get(i)+", "+ans+" , sum "+sum);
	         }
	         
}
}
