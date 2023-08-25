package classwork.chapter3;

public class LongExample {
    public static void main(String args[]) {
        int lightspead;
        long days;
        long seconds;
        long distance;
        // приблизителная скрость света, миль в секунду
        lightspead = 186000;

        days = 1000; // указать количество дней

        seconds = days * 24 * 60 * 60;
        // преобразовать в секунды
        distance = lightspead * seconds;
        //вычислить расстояние
        System.out.print("За " + days);
        System.out.print(" днец свет пройдет около ");
        System.out.println(distance + " миль. ");
    }
}
