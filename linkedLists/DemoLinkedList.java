package linkedLists;

public class DemoLinkedList {
    public static void main(String[] args) {

        Nodewa node1 = new Nodewa(1);

        System.out.println(node1.data);

        Nodewa node2 = new Nodewa(2);
        System.out.println(node2.data);

        node1.next = node2;
        System.out.println(node1.next.data);

        System.out.println();

        DemoLinkedList lst = new DemoLinkedList();
        lst.printData();
    }

    Nodewa head = null;

    public void inserAtBeginning(int item) {

        Nodewa newNode = new Nodewa(item);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head.next;
        head = newNode;
    }

    public void insertAtEnd(int item){
        Nodewa newNode = new Nodewa(item);
        if(head == null){
            head  = newNode;
            return;
        }

        Nodewa temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void inserAtPosition(int item, int position) {
        Nodewa newNode = new Nodewa(item);

        // to check invalid position
        if(position < 0){
            System.out.println("Position is less than 0");
            return;
        }

        //check position == 0
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        //move before the specific position
        Nodewa temp = head;
        int index = 0;
        while(temp  != null){
                temp = temp.next;
                index++;
                if(index == position -1) break;
        }
        if(temp == null){
            System.out.println("Position is out of the bound");
            return;
        }
        //insert
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printData(){
        Nodewa temp = head;
        while(temp != null){
            System.out.print(temp.data + " =>");
            temp = temp.next;
        }
    }




    private static class Nodewa {
        public int data;

        public Nodewa next;

        public Nodewa(int data){
            this.data = data;

            this.next = null;
        }
    }
}
