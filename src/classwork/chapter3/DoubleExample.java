package classwork.chapter3;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class DoubleExample {
    public static void main(String[] args) {
        double pi, r, a;
        r = 10.8;       //радиус окружности
        pi = 3.1416;    //приблизительнлое значение числа пи
        a = pi * r * r;  //вычислить площадь круга

        System.out.println("Площадь круга равен " + a);
    }
}
