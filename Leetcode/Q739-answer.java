import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = temperatures.length-1; i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }
        return result;
        
    }
}
//Another method

//class Solution {
//    public int[] dailyTemperatures(int[] temperatures) {
//        int[] days = new int[temperatures.length];
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(0);
//
//        for(int i = 0 ; i < temperatures.length ; i++){
//            int currTemp = temperatures[i];
//            while(!stack.isEmpty()){
//                int index = stack.peek();
//                int tempTop = temperatures[index];
//                if(tempTop < currTemp){
//                    days[index] = i - index;
//                    stack.pop();
//                } else{
//                    break;
//                }
//            }
//            stack.push(i);
//        }
//        return days;
//    }
//}