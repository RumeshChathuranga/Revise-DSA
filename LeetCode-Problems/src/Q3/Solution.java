package Q3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()<=1) return s.length();

        int left = 0;
        int right = 0;
        int ans = 0;

        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            while (set.contains(c)){
                set.remove(s.charAt(left++));
            }
            ans = Math.max(ans, right - left + 1);
            set.add(c);
            right++;
        }
        return ans;
    }
}

// 1MS beat answer
class Solution2 {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> hmap = new HashMap<>();
        int result=0;

        for(int left=0,right=0;right<s.length();right++) {

            if(hmap.containsKey(s.charAt(right))) {
                left = Math.max(left, hmap.get(s.charAt(right)));
            }

            result = Math.max(result, right-left+1);
            hmap.put(s.charAt(right), right+1);
        }

        return result;
    }
}