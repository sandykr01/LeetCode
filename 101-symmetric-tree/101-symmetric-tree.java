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
    
    public boolean doubleTraversal(TreeNode node, TreeNode node1, TreeNode node2){
        if(node1==null && node2==null) return true; // node 1 and node2 will become null together
        if(node1==node && node2==node) return true; // stop traversal in mid you don't need to travel further
        
        boolean res = (node1==null || node2==null) ? false : node1.val==node2.val;
        if(res==false) return res; // return as you get false no need to check further
        boolean lans = doubleTraversal(node,node1.left,node2.right);
        boolean rans = doubleTraversal(node,node1.right,node2.left);
        
        return res&&lans&&rans;

    }
    
    public boolean isSymmetric(TreeNode root) {
        boolean ans = doubleTraversal(root,root.left,root.right);
        return ans;
    }
}