package classwork.chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Количество вргументов: " + v.length +
                " Содержимое ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}

