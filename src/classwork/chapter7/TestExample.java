package classwork.chapter7;

public class TestExample {
    int a, b;

    TestExample(int i, int j) {
        a = j;
        b = j;
    }

    boolean equalTo(TestExample o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
