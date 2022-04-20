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
    
    public boolean ditto(TreeNode p, TreeNode q){
        if(p==null || q==null) return p==q;
        
        boolean check = p.val==q.val;
        if(check==false) return false;
        boolean left = isSameTree(p.left,q.left);
        boolean right = isSameTree(p.right,q.right);
        
        return check&&left&&right;
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return ditto(p,q);
    }
}