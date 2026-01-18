package Q150;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int a = stack.pop();
                int b = stack.pop();
                int ans = calculate(token, a, b);
                stack.push(ans);
            } else stack.push(Integer.parseInt(token));
        }

        return stack.pop();

    }

    public boolean isOperator(String c) {
        return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
    }

    public int calculate(String s, int a, int b) {
        return switch (s) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        var ans = s.evalRPN(new String[]{"4"});
        System.out.println(ans);
    }

}
