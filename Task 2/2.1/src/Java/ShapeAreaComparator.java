package Java;

import java.util.Comparator;

public class ShapeAreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape shape1, Shape shape2) {
        return (int) (shape1.calcArea() - shape2.calcArea());
    }
}
