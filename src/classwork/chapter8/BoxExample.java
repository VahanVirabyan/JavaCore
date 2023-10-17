package classwork.chapter8;

public class BoxExample {
    double width;
    double height;
    double depth;

    BoxExample(BoxExample ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxExample() {
        width = -1;
        height = -1;
        depth = -1;
    }
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends BoxExample {
    double weight;
    BoxWeight (double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}
