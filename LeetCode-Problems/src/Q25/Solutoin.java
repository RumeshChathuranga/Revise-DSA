package Q25;

import java.util.List;

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
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode ptr = head;
        ListNode ktail = null;
        ListNode newHead = null;

        while (ptr != null) {
            int count = 0;
            ptr = head;

            while(count < k && ptr!=null){
                ptr = ptr.next;
                count++;
            }
            if(count == k){
                ListNode revHead = reverse(head,k);

                if(newHead == null){
                    newHead = revHead;
                }
                if(ktail != null){
                    ktail.next = revHead;
                }
                ktail = head;
                head = ptr;
            }
        }
        if(ktail != null){
            ktail.next = head;
        }

        return newHead == null ? head : newHead;

    }

    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (k > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

            k--;
        }
        return prev;
    }
}