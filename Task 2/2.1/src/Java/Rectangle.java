package Java;

public class Rectangle extends Shape {
    double lenght;
    double width;

    public Rectangle(String colorShape, double width, double lenght) {
        super(colorShape);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double calcArea() {
        return lenght * width;
    }

    @Override
    public String toString() {
        return "Lenght" + lenght
                +"Width" + width;
    }

    @Override
    public void draw() {

    }
}
