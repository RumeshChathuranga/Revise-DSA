package Q239;

import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( k <= 0 || nums.length == 0 ) return new int[0];

        int length  = nums.length;
        int[] res = new int[length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i < length; i++){
            while(!deque.isEmpty() && deque.peek() < i-k + 1){
                deque.poll();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }

            deque.offerLast(i);

            int index = i - k + 1;
            if(index >= 0 && !deque.isEmpty()){
                res[index] = nums[deque.peek()];
            }

        }
        return res;

    }
}