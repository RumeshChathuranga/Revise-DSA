public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack(7);
        stk.push(8);
        stk.push(9);
        stk.push(10);
        System.out.println(stk.pop().value);
        System.out.println(stk.pop().value);
        System.out.println(stk.pop().value);
        stk.getTop();
        stk.getHeight();
        stk.printStack();
    }
}
