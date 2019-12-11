package Java;

public class Treangle extends Shape {
    double side;
    double height;

    public Treangle(String colorShape, double side, double height) {
        super(colorShape);
        this.side = side;
        this.height = height;
    }

    @Override
    double calcArea() {
        return (height * side) / 2;
    }

    @Override
    public String toString() {
        return "side " + side
                +"height" + height;
    }

    @Override
    public void draw() {}
}
