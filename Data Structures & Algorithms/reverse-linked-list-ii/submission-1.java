/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode curr = head ;
        ListNode lnode = null;
        int n =1;

        while (curr != null){
            if (n == left){
                ListNode temp = curr;
                ListNode prev = lnode;
                ListNode next = null;
                while (n != right+1){

                    next = curr.next;
                    curr.next =prev;
                    prev = curr;
                    curr = next ;
                    n++;
                }

                if (lnode==null){
                    temp.next=curr;
                    return prev;
                }

                temp.next = curr;
                lnode.next = prev;
                break;

            }

            lnode = curr;
            curr = curr.next;
            n++;

        }

    return head;

    }
}