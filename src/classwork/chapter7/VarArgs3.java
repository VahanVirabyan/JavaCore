package classwork.chapter7;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...) " +
                "Количество аргументов: "
                + v.length + " Содержимре: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String, int ...): " +
                msg + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}

