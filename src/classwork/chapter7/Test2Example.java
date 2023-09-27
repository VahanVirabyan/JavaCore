package classwork.chapter7;

public class Test2Example {
    int a, b;

    Test2Example(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test2Example o) {
        o.a *= 2;
        o.b /= 2;
    }
}
