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
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode l1 = head;
        ListNode l2 = rev(slow.next);
        slow.next = null;
        ListNode temp = new ListNode(-1, head);
        while (l1 != null && l2 != null) {
            temp.next = l1;
            l1 = l1.next;
            temp.next.next = l2;
            l2 = l2.next;
            temp = temp.next.next;
        }
        temp.next = l1 == null ? l2 : l1;
    }

    public ListNode rev(ListNode l) {
        ListNode prev = null;
        ListNode crr = l;
        while (crr != null) {
            ListNode res = crr.next;
            crr.next = prev;
            prev = crr;
            crr = res;
        }
        return prev;
    }
}