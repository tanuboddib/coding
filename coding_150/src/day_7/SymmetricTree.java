package day_7;

import common.TreeNode;

public class SymmetricTree {

	public boolean symmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null || left.val != right.val){
            return false;
        }
        return symmetric(left.right, right.left) &&
               symmetric(left.left, right.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left, root.right);
    }
    
}
