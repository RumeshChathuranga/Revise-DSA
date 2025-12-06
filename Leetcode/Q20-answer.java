import java.util.Stack;

class Solution {
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
        if (stk.empty()) return true;
        else return false;
    }
}