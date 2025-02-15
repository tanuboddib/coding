package day_7;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class BinaryTreePreorderTraversal {

	public void preorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
    }
	
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
}
