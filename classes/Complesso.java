package classes;


public class Complesso {
    static void LinearTime()
{
    int array[] ={1,2,3,4};
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
}
    static void constantTime(){
        int array[] = {1,2,3,4};

        System.out.println(array[0]);
    }
    public static void main (String[] args){
        constantTime();
        LinearTime();
    }
}
