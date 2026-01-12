package Q76;

import java.util.HashMap;
import java.util.Map;
class Solution {
    public String minWindow(String s, String t) {
        if(s.equals(t)) return s;
        if(s.isEmpty() || t.isEmpty() ||t.length() > s.length()) return "";
        int left = 0, right = 0;
        Map<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < t.length(); i++) {
            tmap.put(t.charAt(i), tmap.getOrDefault(t.charAt(i), 0) + 1);
        }
        int unique = tmap.size();
        int exist = 0;
        Map<Character, Integer> subStr = new HashMap<>();
        int[] arr = {-1,0,0};

        while(right < s.length()) {
            char c = s.charAt(right);
            subStr.put(c, subStr.getOrDefault(c, 0) + 1);
            if( tmap.containsKey(c) && subStr.get(c).intValue() == tmap.get(c).intValue()) {
                exist++;
            }
            while (left <= right && exist == unique) {
                char c1 = s.charAt(left);
                if(arr[0] == -1|| arr[0] > right-left + 1 ) {
                    arr[0] = right-left+1;
                    arr[1] = left;
                    arr[2] = right;
                }
                subStr.put(c1, subStr.get(c1) - 1);
                if( tmap.containsKey(c1) && subStr.get(c1).intValue() < tmap.get(c1).intValue()) {
                    exist--;
                }
                left++;
            }
            right++;
        }
        if(arr[0] == -1) return "";
        else return s.substring(arr[1],arr[2]+1);

    }
}

