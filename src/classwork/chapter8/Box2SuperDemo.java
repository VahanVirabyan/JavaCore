package classwork.chapter8;

public class Box2SuperDemo {
    public static void main(String[] args) {
        Box2Weight myBox1 = new Box2Weight(10, 20, 15, 34.3);
        Box2Weight myBox2 = new Box2Weight(2, 3, 4, 0.076);
        Box2Weight myBox3 = new Box2Weight();
        Box2Weight myCube = new Box2Weight(3, 2);
        Box2Weight myClone = new Box2Weight(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Объем myBox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объем myBox2 равен " + vol);
        System.out.println("Вес myBox2 равен " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Объем myBox3 равен " + vol);
        System.out.println("Вес myBox3 равен " + myBox3.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объем myCube равен " + vol);
        System.out.println("Вес myCube равен " + myCube.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Объем myClone равен " + vol);
        System.out.println("Вес myClone равен " + myClone.weight);

    }
}
