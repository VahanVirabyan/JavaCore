package homework1;

public class ForExamples {
    public static void main(String[] args) {
        int num = 1000;
        for (int i = 0; i < num; i++) {
            System.out.print(i + 1);
            if (i != num - 1) {
                System.out.print(" - ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int max = array[1];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max + " ");
    }
}