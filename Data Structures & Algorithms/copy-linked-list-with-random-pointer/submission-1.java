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

        if (head == null){
            return null;
        }

        Node curr = head;

        // pass 1
        while (curr !=null){
            Node temp = new Node (curr.val);
            temp.next = curr.next;
            curr.next = temp;
            curr  = temp.next;
        }

        curr = head ;
        Node ans = head.next;

        while (curr != null ){
            curr.next.random = (curr.random == null) ? null : curr.random.next;
            curr = curr.next.next;
        }

        curr = head ;
        while (curr != null) {
            Node copy = curr.next;
            Node nextOrig = copy.next;
            curr.next = nextOrig;
            copy.next = (nextOrig == null) ? null : nextOrig.next;
            curr = nextOrig;
        }

        return ans ;

    }
}
