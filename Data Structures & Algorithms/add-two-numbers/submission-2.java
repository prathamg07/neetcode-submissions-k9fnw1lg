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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode dummy = new ListNode(0);   
        ListNode temp = dummy;              
        while (curr1 != null || curr2 != null) {  

            if (curr1 != null) {
                sum += curr1.val;          
                curr1 = curr1.next;
            }

            if (curr2 != null) {
                sum += curr2.val;          
                curr2 = curr2.next;
            }

            ListNode node;                

            if (sum > 9) {
                node = new ListNode(sum % 10);
                sum = 1;
            } else {
                node = new ListNode(sum);
                sum = 0;
            }

            temp.next = node;
            temp = temp.next;              
        }

        if (sum > 0) {                    
            temp.next = new ListNode(sum);
        }

        return dummy.next;                  
    }
}