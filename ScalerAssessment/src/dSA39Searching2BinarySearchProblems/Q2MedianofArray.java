package dSA39Searching2BinarySearchProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2MedianofArray {

	public static void main(String[] args) {
		List<Integer> A=new ArrayList<>(Arrays.asList(-50, -41, -40, -19, 5, 21, 28 ));
		List<Integer> B=new ArrayList<>(Arrays.asList(-50, -21, -10));
		A.addAll(B);
		Collections.sort(A);
		System.out.println(A);
		int n=A.size()-1;
		if(n%2!=0) {
			int a=A.get(n/2);
			int b=A.get((n/2)+1);
			double ans=a+b;
			System.out.println(a+"  "+b+" ="+ans/2);
		}else {
			int a=A.get(n/2);	
			double ans=(a);
			System.out.println(a);
		}
		
	}

}
