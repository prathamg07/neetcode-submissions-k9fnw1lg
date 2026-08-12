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
    boolean flag = true;
    void is_same(TreeNode p,TreeNode q){
        if ((p==null && q!=null) || (p!=null && q==null)){
            flag = false;
            return;
        }
        else if (p==null){
            return;
        }
        if ( p.val != q.val){
            flag = false;
            return;
        }
        is_same(p.left,q.left);
        is_same(p.right,q.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        is_same (p,q);
        return flag;
        
    }
}
