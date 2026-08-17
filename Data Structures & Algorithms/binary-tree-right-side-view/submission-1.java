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
    Queue <TreeNode> q = new LinkedList <>();
    ArrayList <Integer> list = new ArrayList <>();


    public List<Integer> rightSideView(TreeNode root) {

        if (root ==null){
            return list ;
        }

        q.offer(root);

        while (!q.isEmpty()){
            int n = q.size();

            System.out.println("size="+n);

            while (n>1){
                TreeNode temp = q.poll();
                if (temp.left != null){
                    q.offer(temp.left);
                }
                if (temp.right != null){
                    q.offer(temp.right);
              }
                n--;
            }

            System.out.println(n);

            TreeNode temp = q.poll();

            if (temp.left != null){
                    q.offer(temp.left);
                }
                if (temp.right != null){
                    q.offer(temp.right);
              }

            list.add(temp.val);


        }

        return list;
        
    }
}
