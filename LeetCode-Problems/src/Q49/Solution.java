package Q49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//class Solution {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String,List<String>> map = new HashMap<>();
//
//        for(String s : strs){
//            int[] hash = new int[26];
//            for(char c : s.toCharArray()){
//                hash[c-'a']++;
//            }
//            String key = Arrays.toString(hash);
//            if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
//            map.get(key).add(s);
//        }
//        return new ArrayList<List<String>>(map.values());
//    }
//}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] keyArr = s.toCharArray();
            Arrays.sort(keyArr);
            String key = new String(keyArr);
            if(!map.containsKey(key)) map.put(key, new ArrayList<String>());
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
}