package Java;

public abstract class Shape implements Drawable {

    private String colorShape;

    public Shape(String colorShape) {
        this.colorShape = colorShape;
    }

    public String getColorShape() {
        return colorShape;
    }

    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }

    abstract double calcArea();

    @Override
    public String toString() {
        return "Color Shape: " + colorShape;
    }

    @Override
    public void draw() {}
}
