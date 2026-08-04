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
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        // pass 1: create every copy
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // pass 2: wire next and random
        for (Map.Entry<Node, Node> e : map.entrySet()) {
            Node orig = e.getKey();
            Node copy = e.getValue();
            copy.next = map.get(orig.next);
            copy.random = map.get(orig.random);
        }

        return map.get(head);
    }
}