package assesmentsQuestion;

public class ZooGrandParent {

	public static void main(String[] args) {
		

	}

}
/*In a zoo, there are multiple generations of monkeys living in a large enclosure. Each monkey has a unique ID number, and they live in a binary tree hierarchy, with each parent having at most two children. The ID of a monkey is even if the last digit of its number is 0, 2, 4, 6, or 8.

The zookeeper wants to keep track of the total weight of all the monkeys with grandparents that have even IDs, as they believe that these monkeys may be more genetically robust. The weight of a monkey is given by a positive integer value associated with each monkey.

Write a function that takes the root node of the monkey binary tree as input and returns the sum of the weight of all the monkeys with even-valued grandparents. If there are no such monkeys, return 0.
A grandparent of a node is the parent of its parent if it exists.


Problem Constraints
1 <= number of nodes <= 105



Input Format
Only argument is an A denoting the root node of a Binary Tree.



Output Format
Return an integer.


Example Input
Input 1:

           2
         /   \
        2     3
       / \
      4   5
Input 2:

            2
          /   \
         2     3
        / \     \
       4   5     6


Example Output
Output 1:

9

Output 2:

15


Example Explanation
Explanation 1:

Here for nodes 4 and 5 the grandparent is 2 which is even so the total sum is 4+5 =9.
Explanation 1:

Here for nodes 4,5 and 6 the grandparent is 2 which is even so the total sum is 4+5+6 =15 .*/