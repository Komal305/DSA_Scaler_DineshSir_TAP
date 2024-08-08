package dSA47Stacks1ImplementationBasicProblems;

import java.util.Stack;

public class stackBasic {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		Stack<Integer> stt=new Stack<>();
		st.push(8);
		st.push(7);
		st.push(6);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		
		while(!st.empty())
		{
			int a=st.peek();
			if(a%2==0)
				stt.push(st.peek());
			
			st.pop();
		}
		
		System.out.println(" "+stt);
	}

}
