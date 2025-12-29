package Q347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == 0) return new int[0];
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i : nums) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);

        }

        Queue<int[]> pq = new PriorityQueue<>(
                (a, b) -> a[1] - b[1]);

        for (Map.Entry<Integer, Integer> element : hash.entrySet()) {
            pq.offer(new int[]{element.getKey(), element.getValue()});
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] arr = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            arr[i++] = pq.poll()[0];

        }
        return arr;
    }
}
