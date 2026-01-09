package Q424;

class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()<k || s.isEmpty()) return 0;
        int left = 0;
        int right = 0;
        int res = 0;
        int maxOcc = 0;

        int[] arr = new int[26];

        while (right < s.length()) {
            maxOcc = Math.max(maxOcc, ++arr[s.charAt(right)-'A']);
            if(right-left +1 > maxOcc+k) {
                arr[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}

class Solution2 {
    public int characterReplacement(String s, int k) {
        if(s.length()<k || s.isEmpty()) return 0;
        int left = 0;
        int right = 0;
        int res = 0;
        int maxOcc = 0;

        int[] arr = new int[26];

        while (right < s.length()) {
            maxOcc = Math.max(maxOcc, ++arr[s.charAt(right)-'A']);
            while(right-left +1 > maxOcc+k) {
                arr[s.charAt(left)-'A']--;
                left++;
            }
            res = Math.max(res, right - left + 1);

            right++;
        }
        return res;
    }
}