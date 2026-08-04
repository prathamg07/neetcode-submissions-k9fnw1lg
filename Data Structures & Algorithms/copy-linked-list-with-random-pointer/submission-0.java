/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

    public int getVal(Node temp){
        return temp.val;
    }
    public Node getRandom(Node temp){
        return temp.next;
    }

    public Node copyRandomList(Node head) {

        if (head == null){
            return null;
        }

        Node curr = head;

        // pass 1
        HashMap <Node , Node> map = new HashMap <>();

        while (curr !=null){
            Node temp = new Node (curr.val);
            map.put(curr , temp);
            curr  = curr.next;
        }


        for (Node node : map.keySet()){
            Node temp = map.get(node);
            temp.next = map.get(node.next);
            temp.random = map.get(node.random);
        }

        return map.get(head);

    }
}
