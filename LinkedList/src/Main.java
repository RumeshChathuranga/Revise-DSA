public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedlist = new LinkedList(2);
        mylinkedlist.printList();
        mylinkedlist.prepend(1);
        mylinkedlist.printList();
        System.out.println(mylinkedlist.removeFrist().value);
        mylinkedlist.printList();

    }
}
