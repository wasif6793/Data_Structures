package linkedLists;
// operation in nodes
public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.getHead();
        list.getTail();
        list.getLength();
        list.print();

        list.append(2);
        list.append(3);

        list.print();
        System.out.println(list.head.value);

        //reverse the linkedlist
        System.out.println();
        System.out.println("Reverse node ");
        list.reverse();
        list.print();

        System.out.println();
        System.out.println("Find element");
        int value = list.get(1).value;
        System.out.println(value);
        System.out.println(list.head.value);

        System.out.println();
        System.out.println("setting item in linked List");
        System.out.println(list.set(1,4));
        list.print();
        System.out.println(list.head.value);


        //removing last node
        System.out.println();
        System.out.println("Remove last node");
        list.removeLast();
        list.print();
        System.out.println(list.head.value);

        //add element at head
        System.out.println();
        System.out.println("Append Head");
        list.prepend(3);
        list.print();
        System.out.println(list.head.value);

        //removing first element from linkedlist
        System.out.println();
        System.out.println("Remove first element");
        list.removeFirst();
        list.removeFirst();
        list.print();
        System.out.println(list.head.value);

        System.out.println();
        System.out.println("Inserted element");
        list.insert(0,6);
        list.insert(1,7);
        list.insert(2,8);
        list.print();
        System.out.println(list.head.value);

        // remove node using its index
        System.out.println();
        System.out.println("Remove node ");
        list.remove(1);
        list.print();
        System.out.println(list.head.value);

        //find mid node
        System.out.println();
        System.out.println("Mid Node:");
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        Node middleNode = myList.findMiddleNode();
        System.out.println(middleNode.value);
        myList.print();




    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
            Node temp = head;
            Node pre = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }

            return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            head = null;
            tail = null;
        } else{
            head = head.next;
        }
        return head;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    // insert the value in the node between the nodes
    public boolean insert(int index, int value) {

        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    // removing indexed element from node
    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length --;

        return temp;
    }


    //reverse the linkedlist.
    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public Node findMiddleNode() {

        Node slow  = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }



    public void print() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+", ");

            temp = temp.next;
        }
        System.out.println();

    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);

    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public LinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    private static class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }


    }



}

