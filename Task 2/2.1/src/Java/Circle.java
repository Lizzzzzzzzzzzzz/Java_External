package Java;

public class Circle extends Shape {
    final double PI = 3.14;
    double radius;

    public Circle(String colorShape, double radius) {
        super(colorShape);
        this.radius = radius;
    }

    @Override
    double calcArea() {
        return Math.pow(radius, 2) * PI;
    }

    @Override
    public String toString() {
        return "radius " + radius;
    }

    @Override
    public void draw() {}
}
