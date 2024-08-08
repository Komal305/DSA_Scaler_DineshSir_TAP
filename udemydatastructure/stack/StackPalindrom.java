package udemydatastructure.stack;
import java.util.Stack;

public class StackPalindrom {
public static void main(String[] args) {
	String s="mom";
	stackpali(s);
}

public static void stackpali(String s) {
	Stack<Character> st= new Stack<>();
	StringBuilder sb=new StringBuilder(s.length());
	String lowerCase=s.toLowerCase();
	
	for(int i=0;i<lowerCase.length();i++) {
		Character c=lowerCase.charAt(i);
		if(c>='a' &&c<='z') {
			st.push(c);
			sb.append(c);
		}
	}
	StringBuilder rev=new StringBuilder(st.size());
	while(!st.empty()) {
		rev.append(st.pop());
	}
	
	String prints=( rev.toString().equals(sb.toString()))?"yes":"no";
	System.out.println(prints+ "  stringbuilder "+sb+"  stack "+st+" rev "+rev);
}
}
