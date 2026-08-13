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

    TreeNode insertNode (TreeNode root , int val){
        if (root == null){
            root = new TreeNode (val, null , null);
        }
        else if (root.val > val){
            root.left = insertNode (root.left , val);
        }
        else {
            root.right = insertNode (root.right ,val);
        }

        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        return insertNode (root , val);
    }
}