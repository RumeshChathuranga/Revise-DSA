import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public boolean contains(int value){
        if (root == null) return false;
        Node temp = root;
        while(temp != null){
            if (value < temp.value){
                temp = temp.left;
            }else if (value > temp.value) {
                temp = temp.right;
            }else return true;
        }
        return false;
    }

    private boolean rcontains(Node currentNode, int value){
        if (currentNode == null) return false;
        if (currentNode.value == value) return  true;
        if(currentNode.value > value){
            return rcontains(currentNode.left,value);
        }else{
            return rcontains(currentNode.right,value);
        }
    }
    public boolean rcontains(int value){
        return rcontains(root,value);
    }

    private Node rinsert(Node currentNode, int value){
        if (currentNode == null) return (new  Node(value));
        if( value < currentNode.value) {
            currentNode.left = rinsert(currentNode.left, value);
        }else if (value > currentNode.value){ // cant exist duplicates
            currentNode.right = rinsert(currentNode.right,value);
        }
        return currentNode;
    }
    public void rinsert(int value){
        // If root is null the code not going to work
        if( root == null) root = new Node(value);
        rinsert(root, value);
    }

    public int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return  currentNode.value;
    }

    private Node deleteNode(Node curreentNode, int value){
        if (curreentNode == null) return  null;
        if (value < curreentNode.value){
            curreentNode.left = deleteNode(curreentNode.left,value);
        } else if (value > curreentNode.value) {
            curreentNode.right = deleteNode(curreentNode.right, value);
        } else {
            if(curreentNode.left == null && curreentNode.right == null){
                return  null;
            }else if(curreentNode.left == null){
                curreentNode = curreentNode.right;
            } else if (curreentNode.right == null) {
                curreentNode = curreentNode.left;
            }else{
                int subTreeMin = minValue(curreentNode.right);
                curreentNode.value = subTreeMin;
                curreentNode.right = deleteNode(curreentNode.right, subTreeMin);
            }
        }
        return curreentNode;
    }
    public void deleteNode(int value){
        deleteNode(root, value);
    }

    public ArrayList<Integer> BFS(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return  results;
    }
    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> resutls  = new ArrayList<>();

        class Traverse{
            Traverse(Node currentNode){
                resutls.add(currentNode.value);
                if(currentNode.left != null){
                    new Traverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return  resutls;
    }

}
