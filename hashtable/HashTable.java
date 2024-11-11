package hashtable;

import java.util.ArrayList;

public class HashTable {

    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();

        ht.set("a",1);
        ht.set("b",2);
        ht.set("c",3);
        ht.set("d",4);
        ht.set("e",5);
        ht.printTable();
        System.out.println(ht.get("b"));
        System.out.println(ht.get("aa"));
        System.out.println(ht.dataMap.length);
        System.out.println(ht.keys());

    }

    //set value
    public void set(String key, int value) {
        int index =hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            if(temp.key == key){
                temp.value += value;
                return;
            }
            while(temp.next  != null){
                temp = temp.next;
                if(temp.key == key){
                    temp.value += value;
                    return;
                }
            }
            temp.next = newNode;
        }
    }

    //get value

    public int get(String key) {
        int index= hash(key);
        Node temp = dataMap[index];
        while( temp != null){
            if( temp.key == key) return temp.value;
            temp = temp.next;
        }
        return -1;
    }

    //printing the table
    public void printTable(){
        for (int i = 0; i < dataMap.length; i++) {
            System.out.print(i + ": ");
            Node temp = dataMap[i];
            while(temp != null){
                System.out.print("{"+temp.key+ " = " + temp.value+ "}");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    private int hash(String key){
        int hash = 0;
        char[] chars = key.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int asciiValue = chars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }
    //getting keys
    public ArrayList keys(){
        ArrayList list = new ArrayList();
        for(int i  = 0; i< dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp != null){
                list.add(temp.key);
                temp = temp.next;
            }
        }
        return list;
    }



    private class Node {
        private String key;
        private int value;
        private Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
