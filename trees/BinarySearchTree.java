package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;


//    public BinarySearchTree(int value){
//        Node newNode = new Node(value);
//        root = newNode;
//    } no need of this constructor because the root don't require it.

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.rInsert(11);
        System.out.println("root: " + tree.root.value);
        System.out.println(tree.contains(101));

        System.out.println(tree.rContains(9));
    }

    //Insert
    public boolean insert(int value) {

        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if(newNode.value > temp.value){
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // Using Recursion
    private Node rInsert(Node currentNode, int value){
        if(currentNode == null) return new Node(value)  ;

        if(value < currentNode.value){
            currentNode.left = rInsert(currentNode.left, value);
        }
        if(value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    private void rInsert(int value){
        if(root == null) root = new Node(value);
        rInsert(root, value);
    }


    // Search
    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (temp.value == value) return true;
            if(temp.value < value){
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }

    // Using Recursion
    private boolean rContains(Node currentNode, int value){
        if(currentNode == null) return false;

        if(currentNode.value == value) return true;

        if(currentNode.value > value){
            return rContains(currentNode.left, value);
        }
        return rContains(currentNode.right, value);
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }




    //min value
    public int minValue(Node currentNode) {
        while(currentNode != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }



    // Deleting value

    public Node deleteNode(Node currentNode, int value){
        if(currentNode == null) return null;

        if(currentNode.value < value){
            currentNode.left = deleteNode(currentNode.left, value);
        } else if(currentNode.value > value){
            currentNode.right = deleteNode(currentNode.right, value);

        } else {
            if(currentNode.left == null && currentNode.right == null) {
                return null;
            } else if(currentNode.left != null){
                currentNode = currentNode.left;
            } else if(currentNode.right != null){
                currentNode = currentNode.right;
            } else {
                int subTree = minValue(currentNode.right);
                currentNode.value = subTree;
                currentNode.right = deleteNode(currentNode.right, subTree);
            }
        }
        return currentNode;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }









    // BREADTH FIRST SEARCH
    public ArrayList<Integer> BFS() {
        Node currentNode = root;

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);

        while(queue.size() > 0){
            currentNode = queue.remove();
            list.add(currentNode.value);

            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return list;
    }


    // DEPTH FIRST SEARCH

    // PRE-ORDER
    public ArrayList<Integer> DFSPreOrder() {

        ArrayList<Integer> list = new ArrayList<>();

        class Traverse {
            Traverse(Node node) {
                list.add(node.value);

                if(node.left != null){
                   new Traverse(node.left);
                }
                if(node.right != null){
                    new Traverse(node.right);
                }
            }

        }
        new Traverse(root);
        return list;
    }

    //POST-ORDER
    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> list = new ArrayList<>();

        class Traverse {
            Traverse(Node node) {

                if(node.left != null) new Traverse(node.left);

                if(node.right != null) new Traverse(node.right);

                list.add(node.value);
            }
        }
        new Traverse(root);
        return list;
    }

    //IN ORDER
    public ArrayList<Integer> DFSInOredr() {
        ArrayList<Integer> list = new ArrayList<>();

        class Traverse{
            Traverse(Node node) {
                if(node.left != null) new Traverse(node.left);
                list.add(node.value);
                if(node.right != null) new Traverse(node.right);
            }
        }
        new Traverse(root);
        return list;
    }



    class Node{
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }
}
