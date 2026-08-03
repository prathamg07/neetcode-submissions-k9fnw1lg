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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = new ListNode();
        ListNode temp = new ListNode();

        curr.next=head;
        temp.next=head;
        ListNode extra = temp;


        int l=0;

        while (l<n){
            curr = curr.next;
            l++;
        }

        System.out.println(curr.val);


        while (curr.next !=null){
            curr = curr.next;
            temp= temp.next;
        }

        System.out.println(temp.val);

        temp.next = temp.next.next;

        return extra.next;

    }
}
