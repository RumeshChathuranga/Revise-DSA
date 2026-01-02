package Q128;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;

        HashSet<Integer> store = new HashSet<>();
        int ans = 1;


        for(int n : nums){
            store.add(n);
        }

        for(int n: store){
            if(store.contains(n-1)) continue;
            else{
                int current = 1;
                int currentNum = n;
                while (store.contains(currentNum+1)){
                    current++;
                    currentNum++;
                }
                ans = Math.max(ans, current);
            }


        }
        return ans;
    }
}