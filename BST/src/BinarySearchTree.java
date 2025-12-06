public class BinarySearchTree {
    Node root;

    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newnode = new Node(value);
        if (root == null) {
            root = newnode;
            return true;
        }
        Node temp = root;

        while(true){
           if(newnode.value == temp.value) return false;
           if(newnode.value<temp.value){
               if(temp.left == null){
                   temp.left = newnode;
                   return true;
               }
               temp = temp.left;
           }else{
               if(temp.right == null){
                   temp.right=newnode;
                   return true;
               }
               temp = temp.right;
           }

        }
    }

}
