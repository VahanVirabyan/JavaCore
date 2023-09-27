package classwork.chapter7;

public class Box2Test {
    public static void main(String[] args) {
        Box2 myBox1 = new Box2(10,20,15);
        Box2 myBox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        vol = myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Oбъeм куба равен " + vol);
        vol = myclone.volume();
        System.out.println("Oбъeм клона  равен " + vol);
    }
}
