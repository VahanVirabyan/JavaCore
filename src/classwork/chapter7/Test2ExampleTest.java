package classwork.chapter7;

public class Test2ExampleTest {
    public static void main(String[] args) {
        Test2Example ob = new Test2Example(15, 20);
        System.out.println("ob.a и ob.b до вызоыв: " +
                ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызоыв: " +
        ob.a + " " + ob.b);
    }
}
