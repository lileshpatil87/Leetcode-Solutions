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
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode crr = new ListNode(-1);
        ListNode t = crr;
        int carry = 0;
        while (t1 != null || t2 != null || carry != 0) {
            int v1 = t1 != null ? t1.val : 0;
            int v2 = t2 != null ? t2.val : 0;
            int sum = v1 + v2 + carry;
            t.next = new ListNode(sum % 10);
            carry = sum / 10;
            t = t.next;
            t1 = t1 != null ? t1.next : t1;
            t2 = t2 != null ? t2.next : t2;
        }
        return crr.next;
    }
}