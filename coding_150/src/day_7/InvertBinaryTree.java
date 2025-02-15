package day_7;

import common.TreeNode;

public class InvertBinaryTree {
	
	public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode le = root.left;
        root.left = root.right;
        root.right = le;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
