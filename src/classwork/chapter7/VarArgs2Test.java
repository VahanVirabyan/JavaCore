package classwork.chapter7;

import static classwork.chapter7.VarArgs2.vaTest;

public class VarArgs2Test {
    public static void main(String[] args) {
        vaTest("Один параметр переменной длинны: ", 10);
        vaTest("Три параметра переменной длинны: ", 1, 2, 3);
        vaTest("Без параметров переменной длинны: ");
    }
}
