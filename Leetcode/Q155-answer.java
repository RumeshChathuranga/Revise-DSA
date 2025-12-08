import java.lang.Math;

class MinStack {
    private Node top;

    class Node{
        int value;
        int min;
        Node next;

        public Node(int value,int min){
            this.value = value;
            this.min = min;
        }
    }

    public MinStack() {
        top = null;
    }

    public void push(int val) {
        if(top == null){
            top = new Node(val,val);
        }else{
            Node newnode = new Node(val, Math.min(val,top.min));
            newnode.next = top;
            top = newnode;
        }
    }
    public void pop(){
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */