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
    
    static int dia;
    
    public int height(TreeNode node){
        if(node==null) return -1;  // give in terms of no. of edges
        
        int lh = height(node.left);
        int rh = height(node.right);
        
        dia = Math.max(dia,lh+rh+2);
        
        return Math.max(lh,rh)+1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        dia = Integer.MIN_VALUE;
        int ht = height(root);
        return dia;
    }
}