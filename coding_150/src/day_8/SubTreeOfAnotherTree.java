package day_8;

import common.TreeNode;

public class SubTreeOfAnotherTree {
	
	public boolean subtree(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null || root1.val != root2.val){
            return false;
        }
        return subtree(root1.left, root2.left) &&
               subtree(root1.right, root2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null){
            return true;
        }
        if(root == null){
            return false;
        }
        return subtree(root, subRoot) ||
               isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }

}
