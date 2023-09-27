package classwork.chapter7;

import classwork.chapter6.Box;

public class BoxOverLoadTest {
    public static void main(String[] args) {
        BoxOverLoad myBox1 = new BoxOverLoad(10, 20, 15);
        BoxOverLoad myBox2 = new BoxOverLoad();
        BoxOverLoad mycube = new BoxOverLoad(7);
        double vol;
        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
