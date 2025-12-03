public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedlist = new LinkedList(4);
        mylinkedlist.append(3);
        mylinkedlist.printList();
        System.out.println(mylinkedlist.removeLast().value);
        mylinkedlist.printList();
        System.out.println(mylinkedlist.removeLast().value);
        mylinkedlist.printList();
    }
}
