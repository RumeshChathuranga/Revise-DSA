public class Stack {
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node newnode = new Node(value);
        top = newnode;
        height = 1;
    }

    public void push(int value){
        Node newnode = new Node(value);
        if (height == 0) {
            top = newnode;
            height++;
        }else{
            newnode.next = top;
            top = newnode;

        }
        height++;
    }

    public Node pop(){
        if( height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top : " + top.value);
    }
    public void getHeight(){
        System.out.println("Height : " + height);
    }
}
