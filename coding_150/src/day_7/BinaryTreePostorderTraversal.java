package day_7;

import common.TreeNode;

import java.util.List;
import java.util.ArrayList;

public class BinaryTreePostorderTraversal {
	
	public void postorder(TreeNode root, List<Integer> res){
        if(root == null){
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }

}
