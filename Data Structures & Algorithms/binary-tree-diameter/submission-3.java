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
    int diameter = 0;

    int dia (TreeNode root){
        if (root == null){
            return 0 ;
        }

        int left = dia (root.left);
        int right = dia (root.right);

        diameter = Math.max(diameter , left +right);

        return Math.max(left+1,right+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        dia(root);
        return diameter ;
    }
}
