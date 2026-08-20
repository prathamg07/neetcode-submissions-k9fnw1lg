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

    int [] helper (TreeNode root){
        if (root == null){
            int arr [] = {0,0};
            return arr ;
        }

        int left [] = helper (root.left);
        int right [] = helper (root.right);

        int skip = Math.max (left[0],left[1]) +
                Math.max (right[0],right[1]) ;

        int rob = left[0] + right[0] + root.val ;

        int arr[] = { skip , rob };

        return arr ;
    }
    public int rob(TreeNode root) {

        int arr [] = helper (root);

        return Math.max(arr[0],arr[1]);
        
    }
}