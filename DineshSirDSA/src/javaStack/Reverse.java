package javaStack;
import java.util.Stack;
public class Reverse {

	public Reverse() {
		
	}

	public static void main(String[] args) {
		String s="Komal";
		char[] c=s.toCharArray();
		Stack<Character> st=new Stack<>();
		for(char c1:c) {
			st.push(c1);
		}
		
		for(int i=0; i<s.length(); i++) {
			c[i]=st.pop();	
			
			}
		System.out.println(c);
	}

}