import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> lastOccur = new HashMap<>();
        HashSet<Character> visited = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(lastOccur.get(c) == null){
                lastOccur.put(c, 1);
            } else {
                lastOccur.put(c, lastOccur.get(c) + 1);
            }
        }
        for(char c: s.toCharArray()){
            lastOccur.put(c, lastOccur.get(c) - 1);
            if(visited.contains(c)) continue;
            while(!stack.isEmpty() && c < stack.peek() && lastOccur.get(stack.peek()) > 0){
                char removed = stack.pop();

            }
            stack.push(c);
            visited.add(c);
            
        }
        char[] ans = new char[stack.size()];
        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = stack.pop();
        }
        return new String(ans);
    }
}
// Other solution
class Solution2 {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        for (char c : s.toCharArray()) freq[c - 'a']++;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]--;

            if (used[idx]) continue;

            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                used[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            used[idx] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);

        return sb.toString();
    }
}