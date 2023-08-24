package ModelElements;

import java.util.ArrayList;
import java.util.List;
import Staff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<>(0);

    public Poligon(List<Point3D> points){
        this.points = points;
    }
}
