package assesmentsQuestion;

import java.util.Arrays;

public class PaintersPartition {
	public static void main(String[] args) {
		//int A = 2;
		int B = 3;
		int C[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 };
System.out.println(partition(C, B));
		
	}

	static int getMax(int[] A) {
		Arrays.sort(A);
		return A[A.length-1];
	}

	static int getSum(int[] A) {
		int sum = 0;
		for (int a : A)
			sum += a;
		return sum;
	}

	static int numberOfPainters(int A[], int maxLen) {
		int total = 0, numPainters = 1;

		for (int a:A) { //1, 2, 3, 4, 5, 6, 7, 8, 9
			total += a;

			if (total > maxLen) {
				total = a;
				//System.out.println(total);
				numPainters++;
			}

		}
		System.out.println(numPainters);
		return numPainters;
	}
	
	static int partition(int[] A,  int C) {
		int low=getMax(A);
		int high = getSum(A);
		
		while(low<high) {
			int mid = low + (high-low)/2;
			System.out.println(mid+" mid");
			int requiredPainters = numberOfPainters(A, mid);
			if(requiredPainters<=C) high = mid;
			else low = mid + 1;
		}
		
			return low;
	}

}
