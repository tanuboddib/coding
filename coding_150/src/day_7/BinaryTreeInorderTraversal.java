package day_7;

import common.TreeNode;

import java.util.List;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal {

	public void inorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);

        return res;
    }
}
