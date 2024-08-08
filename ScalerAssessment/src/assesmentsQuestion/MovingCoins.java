package assesmentsQuestion;

public class MovingCoins {

	public static void main(String[] args) {
		int[] A= {2, 2, 2, 3, 3};
		int e=0;
		int o=0;
		for(int a:A) {
			if(a%2==0)e++;
			else o++;
	}
		System.out.println(Math.min(e, o));

	}
}
	/*We have N coins, where the position of the ith coin is A[i].

	We need to move all the coins to the same position. In one step, we can change the position of the ith coin from position[i] to:

	position[i] + 2 or position[i] - 2 with cost = 0.

	position[i] + 1 or position[i] - 1 with cost = 1.


	Return the minimum cost needed to move all the coins to the same position.


	Problem Constraints
	1 <= N <= 105

	1 <= A[i] <= 106



	Input Format
	Only argument is an integer array A.


	Output Format
	Return an integer denoting the minimum cost needed to move all the coins to the same position.


	Example Input
	Input 1:

	A = [2, 2, 2, 3, 3]
	Input 2:

	A = [2, 4]


	Example Output
	Ouput 1:

	2
	Output 2:

	0


	Example Explanation
	Explanation 1:

	A = [2, 2, 2, 3, 3] -> 3 coins are at position 2 and 2 coins are at position 3. Now If we try to move all the coins to position 3, the cost would be 3 and if we try to move all the coins to position 2 cost would be 2. Smaller is 2 and that is going to be the answer.
	Explanation 2:

	position = [2, 4] -> 1 coin is at position 2 and 1 coin is at position 4. Now If we try to move all the coins to position 4 or 2, the cost would be 0 that would be the answer.

*/
