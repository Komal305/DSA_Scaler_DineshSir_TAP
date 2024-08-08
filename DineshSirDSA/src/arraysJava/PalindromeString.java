package arraysJava;

public class PalindromeString {
public static void main(String[] args) {
	String s="racecar";
	IsPalindrom(s);
	System.out.println(IsPalindrom(s));
}

//public static void IsPalindrom(String s)
//{
//StringBuffer sb=new StringBuffer();
//	
//	for(int i=s.length()-1;i>=0;i--) {
//	 sb.append(s.charAt(i)).toString();
//	}
//		System.out.println(s.equals(sb.toString())?"yes":"no");
//	
//}

public static boolean IsPalindrom(String s)
{
char[] c=s.toCharArray();
int start=0;
int end =s.length()-1;
while(start<end) {
	if(c[start]!=c[end]) 
		return false;
	start++;end--;
}
		return true;
}
}