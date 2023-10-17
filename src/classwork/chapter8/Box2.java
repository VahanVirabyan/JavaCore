package classwork.chapter8;

public class Box2 {
    private double wigth;
    private double heigth;
    private double depth;

    Box2(Box2 ob) {
        wigth = ob.wigth;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        wigth = w;
        heigth = h;
        depth = d;
    }

    Box2() {
        wigth = -1;
        heigth = -1;
        depth = -1;
    }

    Box2(double len) {
        wigth = heigth = depth = len;
    }

    double volume() {
        return wigth * heigth * depth;
    }
}

class Box2Weight extends Box2 {
    double weight;

    Box2Weight(Box2Weight ob) {
        super(ob);
        weight = ob.weight;
    }

    Box2Weight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    Box2Weight() {
        super();
        weight = -1;
    }

    Box2Weight(double len, double m) {
        super(len);
        weight = m;
    }
}
