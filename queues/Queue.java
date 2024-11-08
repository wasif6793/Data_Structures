package queues;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;

    }

    public static void main(String[] args) {

        Queue queue = new Queue(1);

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.printQueue();


        System.out.println();
        queue.dequeue();
        queue.printQueue();

    }

    public void enqueue(int value) {
        if(length == 0){
            first = new Node(value);
            last = first;
        }
        Node newNode = new Node(value);
        last.next = newNode;
        last = newNode;
        length++;

    }

    public Node dequeue() {
        if(length == 0) return null;

        Node temp = first;
        if(length == 1){
            first = null;
            last = null;
        } else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    //get FIrst
    public void getFirst(){
        System.out.println("First: "+ first.value);
    }

    public void getLast(){
        System.out.println("Last: "+ last.value);
    }

    public void getLength(){
        System.out.println("Length: "+ length);
    }

    //print queue
    public void printQueue(){
        Node temp = first;

        while(temp != null){
            System.out.print(temp.value+ "  ");
            temp = temp.next;
        }
    }






    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
