package homework1;

public class FigurePainter {
    public static void main(String[] args) {
// 1, 2 фигуры
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
        System.out.println();

// 3,4 фигуры
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
// 5 фигура
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1 - i; j--) {
                System.out.print(" ");
            }
            for (int t = 5; t >= i; t--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 + i; j++) {
                System.out.print(" ");
            }
            for (int r = 4; r >= i; r--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

