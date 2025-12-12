public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(7);
        bst.insert(21);
        bst.insert(76);
        bst.insert(17);
        bst.insert(57);
        bst.insert(87);
        System.out.println(bst.rcontains(17));
        System.out.println(bst.rcontains(21));
        System.out.println(bst.rcontains(100));
    }


}
