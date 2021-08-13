import java.util.Scanner;

  class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val;}
  
  TreeNode(int val, TreeNode left, TreeNode right){
  this.val = val;
  this.left = left;
  this.right = right; }
 }
   
public class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Scanner input = new Scanner(System.in);
		TreeNode node = new TreeNode();
		node.val = input.nextInt();
		System.out.println(maxDepth(node));
	}
	
	public static int maxDepth(TreeNode root) {
		if (root == null)
		{
			return 0;
		}
		return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
	}
	
	public class BinaryTree {
		TreeNode root;
	}
	
}

