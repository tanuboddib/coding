package day_8;

import common.TreeNode;

public class DiameterOfBinaryTree {
	
	int max = 0;
    public int getLen(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getLen(root.left);
        int right = getLen(root.right);
        max = Math.max(max, left+right);
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        //System.out.println(left + " " + right);
        if(root == null){
            return 0;
        }
        getLen(root);
        return max;
    }

}
