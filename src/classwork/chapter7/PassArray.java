package classwork.chapter7;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Количество аргументов: " + v.length
                + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}
