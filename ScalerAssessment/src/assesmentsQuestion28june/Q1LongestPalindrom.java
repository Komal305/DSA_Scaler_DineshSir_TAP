package assesmentsQuestion28june;

import java.util.HashMap;
import java.util.Map;

public class Q1LongestPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabc";
		Map<Character, Integer> h=new HashMap<>();
for(char c:s.toCharArray())
	h.put(c, h.getOrDefault(c, 0)+1);

int l=0;
boolean odd = false;
for(int i:h.values()) {
	if(i%2==0) l+=i;
	else {
		l += i-1;
		odd = true;
	}
}

if(odd) System.out.println(l+1);
else
System.out.println(l);
	}
	

}
