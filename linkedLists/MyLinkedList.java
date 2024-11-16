package linkedLists;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
    }

    // Inserting Element At the end
    public  void insertAtEndOrAppend(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
        }
        size++;
    }

    // Inserting Element At the beginning
    public void insertAtHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // Setting Element at the index
    public boolean setAtIndex(int index, int data){
        Node newNode = new Node(data);
        if( size < index || index < 0) System.out.println("Index out of bounds");
        Node temp = head;
        for (int i = 0; i < index; i++) {temp = temp.next;}
        if(temp != null){temp.data = data;
            return true;
        }
        return false;
    }

    //inserting value at index
    public boolean insert(int index, int data){
        Node newNode =  new Node(data);
        if(index > size || index < 0) return false;
        if(index == 0){ insertAtHead(data);
            return true;
        }
        if(index == size) { insertAtEndOrAppend(data);
            return true;
        }
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }

    public boolean set(int index, int data){
        Node newNnode  = new Node(data);

        if(index > size || index < 0) return false;

        Node temp = head;

        for(int i = 0; i < index; i++) { temp = temp.next;}

        if(temp != null) temp = newNnode;
        return true;

    }

    //getting value by using index
    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){temp = temp.next;}
        return temp;
    }

    //remove head node

    public Node removeHead(){
        if( size == 0){
            head = null;
            tail = null;
        } else {
            head = head.next;
        }

        return head;
    }

    //remove tail

    public Node removeTail(){
        if( size == 0){
            return null;
        }
        Node temp = head;
        Node prev = head;

        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }

        tail = prev;
        tail.next = null;
        size--;
        if(size == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    // remove at index

    public boolean removeAtIndex(int index){

        if(index > size || index < 0) return false;
        if(index == 0){removeHead();}
        if(index == size){removeTail();}

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        size--;
        return true;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data+ ", ");
            temp = temp.next;
        }
        System.out.println();
    }
    //value





    // Node Class
    private static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}
