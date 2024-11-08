package trees;

public class BinarySearchTree {
    private Node root;


//    public BinarySearchTree(int value){
//        Node newNode = new Node(value);
//        root = newNode;
//    }



    class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
}
