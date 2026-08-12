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

    int dia (TreeNode root){
        if (root == null){
            return 0 ;
        }

        int left = max_depth(root.left);
        int right = max_depth(root.right);

        return Math.max(left+right , Math.max(dia(root.left),dia(root.right)));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return dia(root);
    }
}
