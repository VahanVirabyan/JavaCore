package homework1.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();

        myArray.push(0);
        myArray.push(1);
        myArray.push(2);
        myArray.push(3);
        myArray.push(27);
        myArray.push(5);
        myArray.push(6);
        myArray.push(7);
        myArray.push(8);
        myArray.push(9);
        myArray.push(10);
        myArray.print();
        System.out.println();
        System.out.println(myArray.getByIndex(5));
        myArray.deleteByIndex(4);
        System.out.println();
        myArray.set(4,50);
        System.out.println();
        myArray.add(4,50);
        System.out.println();

        System.out.println("\n" + myArray.exists(2));
        System.out.println(myArray.getIndexByValue(2));

    }
}
