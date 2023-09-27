package classwork.chapter7;

public class Test3ExampleTest {
    public static void main(String[] args) {
        Test3Example ob1 = new Test3Example(2);
        Test3Example ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличивания значения: " + ob2.a);
    }
}
