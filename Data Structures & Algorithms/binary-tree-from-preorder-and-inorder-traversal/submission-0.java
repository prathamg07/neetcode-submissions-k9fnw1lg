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

    HashMap <Integer , Integer > map = new HashMap <>();

    TreeNode helper (int [] preorder , int [] inorder , int preStart , int inStart , int inEnd ){

        if (inEnd < inStart){
            return null ;
        }

        TreeNode node = new TreeNode (preorder[preStart]);
        int idx = map.get(preorder[preStart]);
        int left_size = idx - inStart ;

        node.left = helper (preorder , inorder , preStart +1 , inStart , idx -1 );
        node.right = helper (preorder , inorder , preStart + left_size + 1 , idx +1 , inEnd);

        return node ;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {


        for (int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i], i);
        }

        return helper (preorder , inorder , 0 , 0 , inorder.length -1);
      
    }
}
