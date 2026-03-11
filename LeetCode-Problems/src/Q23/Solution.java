package Q23;

import java.util.PriorityQueue;

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
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list != null){
                minHeap.add(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode merge = dummy;

        while(!minHeap.isEmpty()){
            merge.next = new ListNode(minHeap.remove());
            merge = merge.next;
        }
        return dummy.next;
    }
}