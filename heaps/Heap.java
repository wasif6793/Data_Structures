package heaps;


import java.util.ArrayList;


public class Heap {
    private ArrayList<Integer> heap = new ArrayList<>();

    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(100);
        heap.insert(200);
        heap.insert(300);
        heap.insert(400);
        heap.insert(500);
        heap.insert(600);
        heap.insert(700);
        heap.insert(800);

        System.out.println(heap.getHeap());
        heap.remove();
        System.out.println(heap.getHeap());
    }

    public ArrayList<Integer> getHeap() {
        return heap;
    }

    private int leftchild(int index){
        return 2 * index + 1;
    }

    private int rightchild(int index){
        return 2 * index + 2;
    }

    private int parent(int index){
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2){

        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);

    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while(current > 0 && heap.get(current) > heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {

        if(heap.size() == 0) return null;
        if(heap.size() == 1) return heap.remove(0);

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    public void sinkDown(int index){
        int maxIndex = index;

        while(true){
            int leftIndex = leftchild(index);
            int rightIndex = rightchild(index);

            if(leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)){
                maxIndex = leftIndex;
            }

            if(rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)){
                maxIndex = rightIndex;
            }

            if(maxIndex != index){
                swap( index , maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }




}
