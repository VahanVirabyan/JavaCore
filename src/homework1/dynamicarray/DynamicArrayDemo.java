package homework1.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray myArray = new DynamicArray();

        myArray.push(2);
        myArray.push(2);
        myArray.push(2);
        myArray.push(2);
        myArray.push(27);
        myArray.push(7);
        myArray.push(2);
        myArray.push(2);
        myArray.push(2);
        myArray.push(2);
        myArray.push(2);
        myArray.print();
        System.out.println(myArray.getByIndex(5));


    }
}
