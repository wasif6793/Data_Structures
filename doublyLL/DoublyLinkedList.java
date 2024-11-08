package doublyLL;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;


    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList(7);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);


        list.removeFirst();
        list.removeLast();
        list.removeAtIndex(2);
        list.insertAtIndex(3,99);
        list.insertAtIndex(2,91);
        list.removeFirst();


        list.printList();
//        System.out.println(list.insertAtIndex(3,10));
//        list.printList();
//        list.removeAtIndex(3);
//        list.printList();
//        list.removeFirst();
//        list.removeLast();
//        list.getHead();
//        list.getTail();
//        list.getLength();
//        list.printList();
//        System.out.println();
//        list.printIndex(3);
//        System.out.println();
//        list.removeAtIndex(3);
//        list.printList();


    }

    // Addinng values in the Doubly LinkedList.
    //adding value in the end of the DLL
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0) {
            head  = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // Adding value at the starting of the DLL
    public void prepand(int value){
        Node newNode = new Node(value);
        if(length == 0) {head  = newNode;
        tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        length++;
    }

    //Insert value at a particular index
    public boolean insertAtIndex(int index, int value){
        if(index < 0 || index > length) return false;

        if(index == 0){
            prepand(value);
            return true;}

        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        Node after = temp.next;

        newNode.prev = temp;
        newNode.next = after;
        temp.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }





    // Removing Values in DLL
    //removing Last (Tail value)
    public Node removeLast(){
        if(length == 0) return null;

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;

        if(length == 0) {head = null;
            tail = null;}

        return temp;
    }

    //removing head or first value from DLL
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        /*
        we can write as same as the removeLast,
        but this is another way or simpler way to do
         */
        if(length == 1){
            head =null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;

    }

    //removing at index
    public Node removeAtIndex(int index){
        if(index < 0 || index >= length) return null;

        if(index == 0){removeFirst();}

        if(index == length-1){removeLast();}

        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next= null;
        temp.prev = null;
        length--;
        return temp;

    }







    // getting and setting values at a particular index
    //get value
    public Node get(int index){
        if(length == 0) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    // Another efficient way for get
    public Node geteff(int index){
        if(length == 0) return null;
        Node temp;
        if(index > length / 2){
            temp = head;
            for(int i = length - 1; i > index; i-- ){
                temp = temp.prev;
            }
        } else {
            temp = tail;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        }
        return null;
    }

    // set value
    public Node set(int index, int value){
        if(length == 0) return null;
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        temp.next = new Node(value);
        return temp;
    }

    // efficient way for set method
    public boolean seteff(int index, int value){
        if(length == 0) return false;
        Node temp = geteff(index);

        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }






    // Printing Values
    // printing the whole LinkedList
    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.value+", ");
            current = current.next;
        }
        System.out.println();
    }

    // Print the value based on the Index
    public void printIndex(int index){

        if(length == 0) return;
        if(index < 0 || index >= length) return;

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        System.out.println("Value at Index: " + index + " is " +temp.value);
    }

    //printing head of the LinkedList
    public void getHead(){
        System.out.println("Head:" + head.value);
    }

    //printing the tail of the LinkedList
    public void getTail(){
        System.out.println("Tail:" + tail.value);
    }

    // printing the length of the LinkedList
    public void getLength(){
        System.out.println("Length:" + length);
    }



    // Class Node
    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
}
