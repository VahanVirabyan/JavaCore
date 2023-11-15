package classwork.chapter12;

public class ValueOfDemo2 {

    public static void main(String[] args) {
        Apple ap;
        System.out.println(
                "Константы пречислимого типа Apple:");
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ap содержит " + ap);
    }
}
