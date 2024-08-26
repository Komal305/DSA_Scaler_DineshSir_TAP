package dSA55_Trees4LCAMorrisInorderTraversal;

import java.util.Stack;


class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	
	TreeNode(int val)
	{
		this.val=val;
		this.left=null;
		this.right=null;
	}
}
public class AQ2_CommonNodesTwoBST {

	public static void main(String[] args) {
		TreeNode rootA = new TreeNode(5);
        rootA.left = new TreeNode(2);
        rootA.right = new TreeNode(8);
        rootA.left.right = new TreeNode(3);
        rootA.right.right = new TreeNode(15);
        rootA.right.right.left = new TreeNode(9);

        // Create Tree B
        TreeNode rootB = new TreeNode(7);
        rootB.left = new TreeNode(1);
        rootB.right = new TreeNode(10);
        rootB.left.right = new TreeNode(2);
        rootB.right.right = new TreeNode(15);
        rootB.right.right.left = new TreeNode(11);
        System.out.println(solve(rootA, rootB));
        
	}



public static int solve(TreeNode A, TreeNode B) {
    Stack<TreeNode> stA = new Stack<>();
    Stack<TreeNode> stB = new Stack<>();
    TreeNode currA = A, currB = B;
    int sum = 0;
    final int MOD = 1000000007;

    while ((currA != null || !stA.isEmpty()) && (currB != null || !stB.isEmpty())) {
        // Push left nodes of A to stack
        while (currA != null) {
            stA.push(currA);
            currA = currA.left;
        }
        for (TreeNode node : stA) {
            System.out.print(node.val + ". ");
        }
        System.out.println();
        // Push left nodes of B to stack
        while (currB != null) {
            stB.push(currB);
            currB = currB.left;
        }

        for (TreeNode node : stB) {
            System.out.print(node.val + ".. ");
        }
        System.out.println();
        
        // Compare the top elements of both stacks
        TreeNode nodeA = stA.peek();
        TreeNode nodeB = stB.peek();

        if (nodeA.val == nodeB.val) {
            // Add the value to the sum and move both pointers to the right
            sum = (sum + nodeA.val) % MOD;
            stA.pop();
            stB.pop();
            currA = nodeA.right;
            currB = nodeB.right;
        } else if (nodeA.val < nodeB.val) {
            // Move the pointer for the smaller value to the right
            stA.pop();
            currA = nodeA.right;
        } else {
            stB.pop();
            currB = nodeB.right;
        }
    }

    return sum;
}
}
