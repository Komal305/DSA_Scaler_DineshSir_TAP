package javaBitManipulation;

public class CheckBit 
{
	public static void main(String[] args) 
	{
		int A=5;
		int B=2;
		int ans =  ((A&(1<<B))!=0)?1:0;
		System.out.println(ans);//1
	}
}
