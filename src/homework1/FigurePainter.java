package homework1;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

