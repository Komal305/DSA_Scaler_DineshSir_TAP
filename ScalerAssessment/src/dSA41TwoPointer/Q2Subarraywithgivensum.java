package dSA41TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2Subarraywithgivensum {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> ans=new ArrayList<>();
		int B=5;
		int i=0, j=a.size()-1;
		while(i<j) {
			int sum=a.get(i)+a.get(j);
			if(sum==B) {
				if(j-1==j)
				ans.add(i); ans.add(j); 
			System.out.println(ans); return;
			}else if(B<sum)i++;
			else j--;
		}
	}

}
