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
        if (head == null) return null;

        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head == null) return null;

        ListNode t1 = head, t2 = head.next;

        while (t2 != null) {
            if (t2.val == val) {
                t1.next = t2.next;
                t2 = t1.next;
            } else {
                t1 = t2;
                t2 = t2.next;
            }
        }

        return head;
    }
}