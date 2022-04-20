/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isTargetSum(TreeNode node, int targetSum){
        if(node==null) return false;
        if(node.left==null && node.right==null){
            targetSum-=node.val;
            if(targetSum==0) return true;
            else return false;
        }
        
        boolean left = isTargetSum(node.left,targetSum-node.val);
        if(left) return true;
        boolean right = isTargetSum(node.right, targetSum-node.val);
        
        return left||right;
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return isTargetSum(root,targetSum);
    }
}