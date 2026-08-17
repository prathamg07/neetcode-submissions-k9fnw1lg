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
    int count = 0;
    int result = 0;

    void helper (TreeNode root , int k){
        if (root == null){
            return ;
        }

        
        helper(root.left , k ); 
        
        if (count +1  == k){
            result = root.val ; 
        }
        count = count +1 ;

        helper(root.right , k);

        return  ;
    }
    public int   kthSmallest(TreeNode root, int k) {

        helper (root , k);
        return result ;


    }
}
