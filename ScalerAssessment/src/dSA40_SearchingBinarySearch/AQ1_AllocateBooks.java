package dSA40_SearchingBinarySearch;

import java.util.Arrays;

public class AQ1_AllocateBooks {

	public static void main(String[] args) {
		int[] A = {12, 34, 67, 90};
		int B = 2;
		int start = Arrays.stream(A).sum();
		int end = A[A.length-1];
		
		
		while(start>end) {
			int mid = (int)(start+end/2);
			System.out.println(mid);
			int req=1;
			int s=0;
			for(int a:A) {
				s +=a;
				if(s>mid) {
					req++;
					s=a;
				}
			}
			if(req<=B) end = mid-1;
			else start = mid+1;
			
		}
		System.out.println(start);
	}

}
