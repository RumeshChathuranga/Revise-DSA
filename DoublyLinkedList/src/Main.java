public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDll = new DoublyLinkedList(7);
        myDll.append(8);
        myDll.append(9);
        myDll.append(10);
        myDll.printList();
        myDll.remveLast();
        myDll.printList();

    }
}
