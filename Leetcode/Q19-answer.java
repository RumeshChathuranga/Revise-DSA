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
        if(n < 0 || head.next == null|| head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        for(int i = 1; i<n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        head = remove(head,slow);
        return head;

    }

    public ListNode remove(ListNode head,ListNode slow){
        ListNode prev = head;
        ListNode after = slow.next;
        if(slow == head) {
            head = head.next;
            prev = null;
            return head;
        }
        while(prev.next != slow && prev != slow){
            prev = prev.next;
        }
        prev.next = after;
        slow.next = null;
        return head;
    }


}
----------------------------------------------------------------
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
        ListNode dummy = new ListNode(0,head);
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n+1; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }


}