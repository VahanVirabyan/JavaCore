package classwork.chapter7;

import static classwork.chapter7.VarArgs3.vaTest;

public class VarArgs3Test {
    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }
}
