package Model.entity;

abstract public class Toy {
    private String size;
    private int price;
    private String color;

    public Toy(String size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "price " + price +
                "color"  + color+
                   "size" + size;
    }

    public abstract String play();
}
