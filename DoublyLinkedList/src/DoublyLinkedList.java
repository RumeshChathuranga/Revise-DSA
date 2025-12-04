public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newnode = new Node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }

    public void append(int value){
        Node newnode = new Node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
        length++;

    }

    public Node remveLast(){
        if (length == 0) return  null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newnode = new Node(value);
        if(length == 0) {
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index<0 || index >= length) return null;
        Node temp = head;
        if(index < length/2){
            for(int i = 0; i< index;i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length-1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void  getHead() {
        System.out.println("Head: "+ head.value);
    }

    public void  getTail() {
        System.out.println("Tail: " +tail.value);
    }

    public void getLength() {
        System.out.println("Length: "+length );
    }
}
