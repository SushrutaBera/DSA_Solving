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
    public ListNode middleNode(ListNode head) {
        ListNode nodei = head, nodej = head;

        while(nodej != null && nodej.next != null) {
            nodei = nodei.next;
            nodej = nodej.next;
            if(nodej.next == null) break;
            nodej = nodej.next;
        }
        
        return nodei;
    }
}