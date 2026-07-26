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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        while(head.val == val && head.next != null) head = head.next;
        if(head.next == null) return head.val == val ? null : head;
        ListNode t1 = head, t2 = head.next;
        while(t2 != null) {
            if(t2.val == val) {
                // if(t2.next == null) t1.next = null;
                    t1.next = t2.next;
                    // t2 = t2.next; 
                
            }
            else t1 = t1.next;
            t2 = t2.next;
        }

        return head;
    }
}