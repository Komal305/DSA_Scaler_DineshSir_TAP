package assesmentsQuestion;

import java.util.ArrayList;

public class GratestParenthesis {

	public static void main(String[] args) {
		int A = 3;
		ArrayList<String> ans = new ArrayList<String>();
		paranthesis(ans, "", 0, 0, A);
		
		ans.forEach(System.out::println);
	}

	private static void paranthesis(ArrayList<String> ans, String string, int i, int j, int a) {
	if(string.length()==a*2) {
		ans.add(string);
		return;
	}
	
	if(i<a) paranthesis(ans, string+"(", i+1, j, a);
	if(j<i) paranthesis(ans, string+")", i, j+1, a);
		
	}
	
	

}
