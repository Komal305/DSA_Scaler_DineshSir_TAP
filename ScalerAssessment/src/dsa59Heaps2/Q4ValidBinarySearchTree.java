package dsa59Heaps2;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
     val = x;
     left=null;
    right=null;
    }
    
public TreeNode() {
		// TODO Auto-generated constructor stub
	}
}
public class Q4ValidBinarySearchTree {
	public static void main(String[] args) {
		TreeNode A=new TreeNode();
		A.val=9;
		A.left.val=99;
		A.right.val=10;
	   isValid(A, Long.MIN_VALUE, Long.MAX_VALUE);
}
	  
static boolean isValid(TreeNode A, long min, long max){
    if(A==null) return true;
    if(A.val<=min || A.val>=max) return false;
   return isValid(A.left, min, A.val) && isValid(A.right, A.val, max);
}
}
