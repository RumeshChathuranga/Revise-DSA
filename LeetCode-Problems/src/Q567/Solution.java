package Q567;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        if(s2.length() < size)
            return false;

        int[] combination = new int[26];
        int[] check = new int[26];

        for(int i = 0; i < size; i++){
            combination[s1.charAt(i) - 'a']++;
            check[s2.charAt(i) - 'a']++;
        }
        for(int window = size; window < s2.length(); window++){
            if(match(combination,check)) return true;

            check[s2.charAt(window) - 'a']++;
            check[s2.charAt(window - size) - 'a']--;

        }
        return match(combination,check);
    }

    private boolean match(int[] combination, int[] check){
        for(int i = 0; i < 26; i++){
            if(combination[i] != check[i]) return false;
        }
        return true;
    }
}
