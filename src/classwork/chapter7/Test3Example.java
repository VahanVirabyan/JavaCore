package classwork.chapter7;

public class Test3Example {
    int a;

    Test3Example(int i) {
        a = i;
    }

    Test3Example incrByTen() {
        Test3Example temp = new Test3Example(a + 10);
        return temp;
    }
}
