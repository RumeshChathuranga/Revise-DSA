package Q22;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        parenthesis(ans, new StringBuilder(),0,0, n);
        return ans;
    }

    private void parenthesis(List<String> ans, StringBuilder sb, int left, int right, int max){
        if(sb.length() == max * 2) {
            ans.add(sb.toString());
            return;
        }

        if(left < max) {
            sb.append('(');
            parenthesis(ans, sb, left+1, right, max);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right < left) {
            sb.append(')');
            parenthesis(ans, sb, left, right+1, max);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}