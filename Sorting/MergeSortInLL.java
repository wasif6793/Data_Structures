package Sorting;

public class MergeSortInLL {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);

        l1.printAll();
    }


    private static class LinkedList {

        private Node head;
        private Node tail;
        private int length;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public int getLength() {
            return length;
        }

        public void makeEmpty() {
            head = null;
            tail = null;
            length = 0;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
            }
        }

        public void printAll() {
            if (length == 0) {
                System.out.println("Head: null");
                System.out.println("Tail: null");
            } else {
                System.out.println("Head: " + head.value);
                System.out.println("Tail: " + tail.value);
            }
            System.out.println("Length:" + length);
            System.out.print("\nLinked List:");
            if (length == 0) {
                System.out.println("empty");
            } else {
                printList();
            }
        }

        public void append(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }

        public void merge(LinkedList otherList){
            Node dummy = new Node(0);
            Node current = dummy;
            Node l1 = this.head;
            Node l2 = otherList.head;

            while(l1 != null && l2 != null){
                if(l1.value < l2.value){
                    current.next = l1;
                    l1 = l1.next;

                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
            if(l1 != null){
                current.next = l1;
                l1 = l1.next;
            }else {
                current.next = l2;
                tail = otherList.getTail();
            }

            head = dummy.next;

            this.length += otherList.getLength();

        }




    }



}
