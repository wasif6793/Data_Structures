package ArrayProblem;

public class ArrayOperation {
    public static void main(String[] args) {

        ArrayAdt array = new ArrayAdt(10);

        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.insert(7);
        array.insert(8);

        for (int i = 0; i < array.getSize(); i++) {
            System.out.print(array.get(i));

        }
        System.out.println();

        System.out.println(array.getSize());

        System.out.println(array.search(4));
        array.delete(4);

        for (int i = 0; i < array.getSize(); i++) {
            System.out.print(array.get(i));

        }
        System.out.println();

    }
}
