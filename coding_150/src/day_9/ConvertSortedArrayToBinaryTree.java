package day_9;

import common.TreeNode;

public class ConvertSortedArrayToBinaryTree {

	public TreeNode buildTree(int[] nums, int min, int max){
        if(min < 0 || min > max || max < min || max >= nums.length){
            return null;
        }
        int idx = (min+max)/2;
        TreeNode node = new TreeNode(nums[idx]);
        node.left = buildTree(nums, min, idx-1);
        node.right = buildTree(nums, idx+1, max);

        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = buildTree(nums, 0, nums.length-1);
        
        return root;
    }
}
