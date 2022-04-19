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
    
    public void rootToLeaf(TreeNode node, List<String> ans, String psf){
        if(node==null) return;
        if(node.left==null && node.right==null){
            ans.add(psf+""+node.val);
        }
        
        rootToLeaf(node.left,ans,psf+node.val+"->");
        rootToLeaf(node.right,ans,psf+node.val+"->");
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        rootToLeaf(root,ans,"");
        return ans;
    }
}