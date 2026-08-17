/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    Node helper (int [][] grid , int  row , int col , int size ){
        if (size==1){
            Node node = new Node (grid[row][col] ==1 ,true);
            return node ;
        }

        Node top_left = helper (grid , row , col , size/2);
        Node top_right = helper(grid , row , col + size/2 , size/2);
        Node bottom_left = helper (grid , row + size /2 , col , size/2);
        Node bottom_right = helper (grid , row + size/2 , col + size/2 , size/2);

        if (top_left.val == top_right.val && top_right.val == bottom_left.val && bottom_left.val == bottom_right.val && top_left.isLeaf && top_right.isLeaf && bottom_left.isLeaf && bottom_right.isLeaf    ){
            Node node = new Node (top_left.val == true  , true );
            return node  ;
        }
        else{
            Node node = new Node (top_left.val == true , false , top_left , top_right , bottom_left , bottom_right);
            return node ;
        }
    }
    public Node construct(int[][] grid) {
        return helper (grid ,0, 0 , grid[0].length);

    }
}