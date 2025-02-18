package day_9;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class BinaryTreePaths {
	
	List<String> res = new ArrayList<>();
    public void path(TreeNode root, List<Integer> p){
        p.add(root.val);
        if(root.left == null && root.right == null){
            int len = p.size();
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(p.get(0)));
            for(int i=1;i<len;i++){
                sb.append("->" + String.valueOf(p.get(i)));
            }
            res.add(sb.toString());
        }
        if(root.left != null){
            path(root.left, p);
        }
        if(root.right != null){
            path(root.right, p);
        }
        p.remove(p.size()-1);
        return;

    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return res;
        }
        List<Integer> p = new ArrayList<>();
        path(root, p);
        return res;
    }

}
