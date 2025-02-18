package day_9;

import common.TreeNode;

import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class CousinsInBinaryTree {
	
	public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        if(root.val == x || root.val == y){
            return false;
        }
        Queue<TreeNode> que = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        que.add(root);
        while(!que.isEmpty()){
            int s = que.size();
            boolean foundX = false;
            boolean foundY = false;
            for(int i=0;i<s;i++){
                TreeNode node = que.poll();
                if(node.val == x){
                    foundX = true;
                }
                if(node.val == y){
                    foundY = true;
                }
                if(node.left != null){
                    que.offer(node.left);
                    map.put(node.left.val, node.val);
                }
                if(node.right != null){
                    que.offer(node.right);
                    map.put(node.right.val, node.val);
                }
            }
            if(foundX && foundY && map.get(x) != map.get(y)){
                return true;
            }
        }
        return false;
    }
	
	/**
	 * public boolean isCousins(TreeNode root, int x, int y) {
        // Edge case: if the root is null, no cousins can exist
        if (root == null) return false;
        
        // Initialize BFS queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depthY = -1;
        int depthX = -2;
        int level = 0;
        
        // BFS traversal to find x and y with their parents
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {                
                TreeNode node = queue.poll();
                if(node.left != null && node.right != null){
                    if(node.left.val == x && node.right.val == y) return false;
                    if(node.left.val == y && node.right.val == x) return false;
                }
                if(node.val == x) depthX = level;
                if(node.val == y) depthY = level;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        
        return depthX == depthY;
    }
	 * 
	 */
	
}
