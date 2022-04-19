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
    
    public void swapChilds(TreeNode node){
        if(node==null) return;
        
        swapChilds(node.left);
        swapChilds(node.right);
        // must think why we have to swap childs in postOrder why not in inOrder ??
        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
    }
    
    public TreeNode invertTree(TreeNode root) {
        swapChilds(root);
        return root;
    }
}