package dSA39Searching2BinarySearchProblems;

import java.util.Comparator;

public class Q4SquareRootInteger {

	public static void main(String[] args) {
		int A=11;
		int start=1, end=A;
		int ans=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(A/mid>=mid) {
				ans=mid;
				start = mid+1;
			}else{
				end=mid-1;
			}
		}
		System.out.println(ans);
	}

}
