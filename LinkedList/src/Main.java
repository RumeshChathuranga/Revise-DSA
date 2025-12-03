public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedlist = new LinkedList(2);
        mylinkedlist.append(3);
        mylinkedlist.append(4);
        mylinkedlist.append(5);
        mylinkedlist.append(6);
        mylinkedlist.printList();
        mylinkedlist.reverse();
        mylinkedlist.printList();
    }
}
