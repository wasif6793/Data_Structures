package ArrayProblem;

public class ArrayAdt {

    private int[] array;
    private int index;
    private int size;

    // constructor
    public ArrayAdt(int size) {
        this.size = size;
        this.array = new int[this.size];
        this.index = 0;
    }

    //insert
    public void insert(int value) {
        // check if the array is full or not

        if(index == this.size){
            System.out.println("Array is full");
            return;
        }
        array[index] = value;
        index++;
    }

    //delete
    public void delete(int delindex) {

        if(delindex < 0 || delindex >= this.size){
            System.out.println("Invalid index");
            return;
        }

        for (int i = delindex; i < index - 1; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    //search
    public int search(int value){
        int indResult = -1;

        for (int i = 0; i < index; i++) {
            if(array[i] == value){
                indResult = i;
                break;

            }
        }
        return indResult;
    }

    //get index
    public int get(int getIndex){
        if(getIndex < 0 || getIndex >= this.size){
            System.out.println("Invalid index");
            return -1;
        }

        return array[getIndex];
    }

    //traverse
    public void traverse(){
        for (int i = 0; i < this.index; i++) {
            System.out.println(array[i] + "\t");
        }
        System.out.println();
    }

    //update
    public void update(int updateIndex, int value){
        if(updateIndex < 0 || updateIndex >= this.size){
            System.out.println("Invalid index");
            return;
        }
        array[updateIndex] = value;

    }

    public int getSize(){
        return this.size;
    }



}
