package classwork.chapter5;

public class BodyExample {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while(++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
