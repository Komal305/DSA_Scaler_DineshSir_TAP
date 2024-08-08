package dSA26BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AQ2LetterPhone {
	static Map<Character, String> m=new HashMap<>();
   static {
	m.put('0', "0");
    m.put('1',"1");
    m.put('2', "abc");
    m.put('3', "def");
    m.put('4', "ghi");
    m.put('5', "jkl");
    m.put('6', "mno");
    m.put('7', "pqrs");
    m.put('8', "tuv");
    m.put('9', "wxyz");
   }
	public static void main(String[] args) {
		String A="23";
		
        
        
        ArrayList<String> ans=new ArrayList<>();
        
        BackTrack(ans, new StringBuilder(), A, 0);
        Collections.sort(ans);
        System.out.println(ans);
        

	}
	
	static void BackTrack(ArrayList<String> ans, StringBuilder sb, String A, int index) {
		if(A.length()==index) {
			ans.add(sb.toString());
			return;
		}
		
		String s=m.get(A.charAt(index));
		System.out.println(s);
		char[] s1=s.toCharArray();
		for(char ch=0; ch<s1.length; ch++) {
			sb.append(s1[ch]);
			BackTrack(ans, sb, A, index+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}
