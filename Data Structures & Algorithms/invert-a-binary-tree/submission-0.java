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
    void dfs_change(TreeNode root){
        if (root == null){
            return ;
        }

        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        dfs_change(root.left);
        dfs_change(root.right);
    }

    public TreeNode invertTree(TreeNode root) {

        //dfs travel of the tree

        dfs_change(root);
        

        return root;
        
    }
}
