public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.rinsert(7);
        bst.rinsert(21);
        bst.rinsert(76);
        bst.rinsert(17);
        bst.rinsert(57);
        bst.rinsert(87);
        System.out.println(bst.rcontains(17));
        System.out.println(bst.rcontains(21));
        System.out.println(bst.rcontains(100));
    }


}
