package classwork.chapter7;

public class TestExampleTest {
    public static void main(String[] args) {
        TestExample ob1 = new TestExample(100,22);
        TestExample ob2 = new TestExample(100,22);
        TestExample ob3 = new TestExample(-1, -1);
        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
