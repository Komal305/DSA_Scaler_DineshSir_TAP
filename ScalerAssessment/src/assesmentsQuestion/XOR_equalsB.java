package assesmentsQuestion;

public class XOR_equalsB {

	public static void main(String[] args) {
		int[] A= {2, 3};
		int B=0;
		
		int x=0;
		for(int a:A) System.out.println(x ^=a);
		System.out.println(x^=B);

	}

}
/*Input 1:
A = [2, 3]
B = 0
Input 2:
A = [2, 5, 7, 9]
B = 6


Example Output
Output 1:
1
Output 2:
15


Example Explanation
Explanation 1:
1 XOR 2 XOR 3 = 0
Explanation 2:
2 XOR 5 XOR 7 XOR 9 XOR 15 = 6*/