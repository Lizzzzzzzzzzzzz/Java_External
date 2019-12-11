package Java;

public class ShapeArray {
    public Shape[] createArray() {
        Shape[] objects = new Shape[10];
        objects[0] = new Rectangle("black", 10, 10);
        objects[1] = new Treangle("purple", 10, 7);
        objects[2] = new Circle("yellow", 5);
        objects[3] = new Treangle("blue", 6, 8);
        objects[4] = new Rectangle("acid", 7, 9);
        objects[5] = new Treangle("white", 13, 12);
        objects[6] = new Rectangle("grey", 3, 15);
        objects[7] = new Treangle("white", 13, 12);
        objects[8] = new Circle("green", 6);
        objects[9] = new Circle("solid-blue", 8);

        return objects; }

    public void printArray(Shape[] array) {
        System.out.println(array.toString()); }

    public double shapeAreaSum(Shape[] array) {
        double shapeAreaSum = 0;
        for (Shape o: array) {
            shapeAreaSum += o.calcArea();
        }
        return  shapeAreaSum; }

    public double choosedShapeAreaSum(Shape[] array, String shape ) {
        double choosedShapeAreaSum = 0;
        for (Shape o : array) {
            if(shape.equals(o.getClass())) choosedShapeAreaSum += o.calcArea();
        }
        return choosedShapeAreaSum; }
}
