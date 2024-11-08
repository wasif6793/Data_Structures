package stacks;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(2);
        stack.getTop();
        stack.getHeight();

        stack.pop();
        stack.getTop();
        stack.getHeight();
    }


    //push
    public void push(int value) {
        Node newNode = new Node(value);
        if(height == 0){
            top = newNode;
        } else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }


    //pop
    public Node pop() {
        if(height == 0) return null;
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
        return temp;

    }




    //Printing all the values in the stack
    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }



    //get method
    public void getTop(){
        System.out.println("Top value: " + top.value);
    }

    public void getHeight(){
        System.out.println("Size: " + height);
    }






    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
