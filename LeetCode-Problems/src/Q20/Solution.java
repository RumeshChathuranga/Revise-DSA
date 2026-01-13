package Q20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Map<Character,Character>  map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }else {
                if(stack.isEmpty()) return false;
                Character peek = stack.pop();
                if (map.get(peek) != peek) return false;
            }
        }
        return stack.isEmpty();
    }
}



class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char character : s.toCharArray()) {
            if(character == '(' || character == '{' || character == '['){
                stk.push(character);
            }else if(!stk.empty() && ((character == ')' && stk.peek() == '(') ||
                    (character == ']' && stk.peek() == '[') ||
                    (character == '}' && stk.peek() == '{'))
            ) {
                stk.pop();
            }else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}