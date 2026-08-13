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

    TreeNode helper (TreeNode root , TreeNode p , TreeNode q){

        if (root.val > p.val && root.val > q.val){
            return helper (root.left , p , q);
        }
        else if (root.val < p.val && root.val < q.val ){
            return helper (root.right , p ,q);
        }
        
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return helper (root , p ,q);
        
    }
}
