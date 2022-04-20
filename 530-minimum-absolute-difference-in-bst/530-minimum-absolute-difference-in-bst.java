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
    
    static int mn;
    static TreeNode prevNode;
    
    public void inOrder(TreeNode node){
        if(node==null) return;
        
        inOrder(node.left);
        if(prevNode!=null) mn = Math.min(mn,Math.abs(prevNode.val-node.val));
        prevNode = node;
        inOrder(node.right);
    }
    
    public int getMinimumDifference(TreeNode root) {
        mn = Integer.MAX_VALUE;
        prevNode = null;
        inOrder(root);
        return mn;
    }
}