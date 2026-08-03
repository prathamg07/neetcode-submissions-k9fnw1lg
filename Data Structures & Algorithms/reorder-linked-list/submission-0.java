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
    public void reorderList(ListNode head) {

        ListNode slow = head ;
        ListNode fast = head ;

        while (fast != null &&  fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode right = slow.next;
        slow.next=null;
        

        //reverse the slow list

        ListNode next = null ;
        ListNode prev =null;

        while (right != null){
            next = right.next;
            right.next=prev;
            prev = right;
            right = next;
        }

        //join curr and prev

        ListNode curr = head ;
        ListNode temp_curr = null ;
        ListNode temp_prev = null;

        while (prev !=null){

            temp_curr = curr.next;
            temp_prev = prev.next;
            prev.next = curr.next;
            curr.next = prev;


            prev=temp_prev;
            curr=temp_curr;
            
        }



        
    }
}
