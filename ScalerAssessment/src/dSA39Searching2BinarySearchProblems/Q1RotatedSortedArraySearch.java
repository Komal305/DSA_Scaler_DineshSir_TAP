package dSA39Searching2BinarySearchProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1RotatedSortedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> A=new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
int B=4;
int s=0, e=A.size()-1;
int mid=s+(e-s)/2;
System.out.println(A.size());
while(s<e){
    if(A.get(mid)==B){
    	System.out.println(mid);
    	break;
    }else if(A.get(mid)<B)
    s=mid+1;
    else
    e=mid-1;
}

	}

}
