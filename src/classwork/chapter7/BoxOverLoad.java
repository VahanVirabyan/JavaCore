package classwork.chapter7;

import java.sql.PreparedStatement;

public class BoxOverLoad {
    double width;
    double height;
    double depth;

    BoxOverLoad(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxOverLoad() {
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxOverLoad(double len) {
        width = height = depth = len;
    }
    double volume() {
        return width * height * depth;
    }
}
