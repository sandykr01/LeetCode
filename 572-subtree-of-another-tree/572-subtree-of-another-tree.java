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
    
    static boolean ans;
    
    public boolean checkPresence(TreeNode node1, TreeNode node2){
        if(node1==null || node2==null) return node1==node2;
        
        boolean left = checkPresence(node1.left,node2.left);
        boolean right = checkPresence(node1.right,node2.right);
        
        
        return (node1.val==node2.val)&&left&&right;

    }
    
    public void traversal(TreeNode root, TreeNode subRoot){
        if(root==null) return;
        
        if(root.val==subRoot.val) ans = ans||checkPresence(root,subRoot);
        traversal(root.left,subRoot);
        traversal(root.right,subRoot);
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        ans = false;
        
        traversal(root,subRoot);
        
        return ans;
    }
}