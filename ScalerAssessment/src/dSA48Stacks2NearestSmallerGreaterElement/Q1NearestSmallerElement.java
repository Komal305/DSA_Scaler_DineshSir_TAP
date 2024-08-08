package dSA48Stacks2NearestSmallerGreaterElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Q1NearestSmallerElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> A=new ArrayList<>(Arrays.asList(4,5,2,10,8));
		 Stack<Integer> st=new Stack<Integer>();
	       ArrayList<Integer> ans=new ArrayList<>(Collections.nCopies(A.size(), -1));
	        for(int i=0; i<A.size(); i++)
	        {
	        	
	            while(!st.isEmpty() && A.get(st.peek())>=A.get(i))
	            { 
	            
	           // System.out.println(A.get(st.peek()));//5//4//10
	            st.pop();
	            }

	            if(!st.isEmpty()) 
	            ans.set(i, A.get(st.peek()));

	           System.out.println(st.push(i)); //st.push(i);
	        }
System.out.println(ans);
	}

}
