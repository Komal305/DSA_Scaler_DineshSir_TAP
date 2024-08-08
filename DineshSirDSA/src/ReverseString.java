

public class ReverseString {
	public static void main(String[]args)
	{
		String s1="Bhagyashri";
		String s="";
		for(int i=s1.length()-1;i>=0;i--)
		{
		
		s +=s1.charAt(i);
		}
		System.out.println(s1 +"   "+s);
	}
}
