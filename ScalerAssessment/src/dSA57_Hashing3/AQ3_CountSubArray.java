package dSA57_Hashing3;

import java.util.HashMap;
import java.util.Map;

public class AQ3_CountSubArray {

	public static void main(String[] args) {
		//int[] A = { 1, 3, 1 };
String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
char[] A = s.toCharArray();
		int n = A.length;
		Map<Character, Integer> h = new HashMap<>();
		int j = 0;
		long count = 0;
		for (int i = 0; i < n; i++) {
			h.put(A[i], h.getOrDefault(A[i], 0) + 1);

			
			while (h.get(A[i]) > 1) {
				h.put(A[j], h.get(A[j]) - 1);
				j++;
			}

			count += (i - j + 1);
		}
		System.out.println(count);
	}

}
