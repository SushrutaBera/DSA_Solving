/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lena = 0, lenb = 0;

        ListNode ta = headA, tb = headB;
        while(ta != null) {
            lena++;
            ta = ta.next;
        }

        while(tb != null) {
            lenb++;
            tb = tb.next;
        }

        ta = headA; tb = headB;

        for(int i = 0; i < lena - lenb; i++) ta = ta.next;
        for(int i = 0; i < lenb - lena; i++) tb = tb.next;

        while(ta != null || tb != null) {
            if(ta == tb) return ta;
            ta = ta.next;
            tb = tb.next;
        }

        return null;
    }
}