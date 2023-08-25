package classwork.chapter2;

import java.sql.SQLOutput;

public class IfSample {
    public static void main(String args[]) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x меньше y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x теперь равно y");
        }

        x = x * 2;
        if (x > y) {
            System.out.println("x теперь больше  y");
        }

        if (x == y) {
            System.out.println("вы не увидите этого");
        }


    }
}
