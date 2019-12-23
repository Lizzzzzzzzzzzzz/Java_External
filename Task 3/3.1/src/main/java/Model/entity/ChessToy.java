package Model.entity;

public class ChessToy extends Toy {
    private int height;
    private int width;

    public ChessToy(String size, int price, String color, int height, int width) {
        super(size, price, color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String play() {
        return null;
    }

}
