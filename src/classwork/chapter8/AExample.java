package classwork.chapter8;

public class AExample {
    int i, j;

    void showij() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends AExample {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}
