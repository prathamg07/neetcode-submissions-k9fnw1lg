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

    boolean subtree (TreeNode p , TreeNode q){
        if (p==null){
            return false ;
        }
        return check(p,q) || subtree(p.left, q) || subtree(p.right, q);
    }

    boolean check (TreeNode p,TreeNode q){
        if ((p==null && q!=null) || (p!=null && q==null)){
            return false;
        }
        else if (q==null){
            return true;
        }
        if ( p.val != q.val){
            return false;
        }
        return check(p.left, q.left) && check(p.right, q.right);
    }

    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return subtree (root,subRoot);

    }
}
