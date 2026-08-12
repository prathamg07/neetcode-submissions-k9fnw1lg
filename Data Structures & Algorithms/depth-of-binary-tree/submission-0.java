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
    int max_depth (TreeNode root){
        if (root == null){
            return 0 ;
        }

        return Math.max(max_depth(root.left)+1,max_depth(root.right)+1);
    }

    public int maxDepth(TreeNode root) {

        int k = max_depth(root);
        return k;
        
    }
}
