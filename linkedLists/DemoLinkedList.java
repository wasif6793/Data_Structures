package linkedLists;

public class DemoLinkedList {
    public static void main(String[] args) {

        Nodewa node1 = new Nodewa(1);

        System.out.println(node1.data);

        Nodewa node2 = new Nodewa(2);
        System.out.println(node2.data);

        node1.next = node2;
        System.out.println(node1.next.data);
    }

    Nodewa head = null;




    private static class Nodewa {
        public int data;

        public Nodewa next;

        public Nodewa(int data){
            this.data = data;

            this.next = null;
        }
    }
}
