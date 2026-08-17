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

    boolean helper (TreeNode root , Integer low , Integer high ){
        if (root == null){
            return true ;
        }
        
        if (root.val >= high || root.val <= low ){
            return false ;
        }

        return helper (root.left , low , root.val) && helper(root.right , root.val , high);
    }
    public boolean isValidBST(TreeNode root) {

       return helper (root , -1000000001 , 1000000001 );
    }
}
