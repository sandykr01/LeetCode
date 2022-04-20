/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode LCA;
    
    public void findLCA(TreeNode root, TreeNode p, TreeNode q){
        if(root==null) return;
        
        if(p.val<root.val && q.val<root.val) findLCA(root.left,p,q);
        else if(p.val>root.val && q.val>root.val) findLCA(root.right,p,q);
        else{
            LCA = root;
            return;
        }
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLCA(root,p,q);
        return LCA;
    }
}