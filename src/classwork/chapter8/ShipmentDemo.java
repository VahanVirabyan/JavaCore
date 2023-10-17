package classwork.chapter8;

public class ShipmentDemo {
    public static void main(String[] args) {
        Shipment Shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment Shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = Shipment1.volume();
        System.out.println("Объем Shipment1 равен " + vol);
        System.out.println("Вес Shipment1 равен " + Shipment1.weight);
        System.out.println("Стоимость доставки: $" + Shipment1.cost);
        System.out.println();
        vol = Shipment2.volume();
        System.out.println("Объем Shipment2 равен " + vol);
        System.out.println("Вес Shipment2 равен " + Shipment2.weight);
        System.out.println("Стоимость доставки: $" + Shipment2.cost);

    }
}
