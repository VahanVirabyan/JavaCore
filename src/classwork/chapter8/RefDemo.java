package classwork.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        BoxExample plainBox = new BoxExample();
        double vol;

        vol = weightBox.volume();
        System.out.println("Объем weightBox равен " + vol);
        System.out.println("Вес weightBox равен " + weightBox.weight);
        System.out.println();
        plainBox = weightBox;
        vol = plainBox.volume();
        System.out.println("Объем plainBox равен " + plainBox.width);
    }
}
