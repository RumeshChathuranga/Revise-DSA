package Q143;

class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next== null) return;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = reverseList(slow.next);
        slow.next = null;

        while (second != null) {
            ListNode temp1 = head.next;
            ListNode temp2 = second.next;

            head.next = second;
            second.next = temp1;

            second = temp2;
            head = temp1;

        }

    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

}