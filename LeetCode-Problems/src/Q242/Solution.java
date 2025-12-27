package Q242;

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            int i = c - 'a';
            arr[i]++;
        }
        for(char c : t.toCharArray()){
            int j = c - 'a';
            arr[j]--;
        }

        for(int i : arr){
            if(i!= 0) return false;
        }
        return true;
    }
}