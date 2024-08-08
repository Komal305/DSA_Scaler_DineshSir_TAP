package dsa38Searching1BinarySearchOnArray;

import java.util.Arrays;

public class Q2SearchforRange {

	public static void main(String[] args) {
		int[] A= {5, 7, 7, 8, 8,8,8,8, 10,12};
		int B=8;
		
		int[] n=new int[2];
		n[0]=firstIndex(A, B);
		n[1]=LastIndex(A, B);
		 System.out.println(Arrays.toString(n));
		
		
	}
	public static int firstIndex(int[] A, int B) {
		int first=0;
		int last=A.length-1;
		int n1=-1;
		while(first<=last) {
			int mid=first+(last-first)/2;
			if(A[mid]==B ) {
				n1=mid;
			last=mid-1;
			}
			else if(A[mid]<B)
				first=mid+1;
			else
				last=mid-1;		
		}
		return n1;
	}
	
	public static int LastIndex(int[] A, int B) {
		int first=0;
		int last=A.length-1;
		int n2=-1;
		while(first<=last) {
			int mid=first+(last-first)/2;
			if(A[mid]==B ) {
				n2=mid;
			first=mid+1;
			}
			else if(A[mid]<B)
				first=mid+1;
			else
				last=mid-1;		
		}
		return n2;
	}

}
