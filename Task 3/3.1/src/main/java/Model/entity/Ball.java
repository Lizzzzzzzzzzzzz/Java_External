package Model.entity;

import Model.Interface.SelfMoveable;

public class Ball extends Toy implements SelfMoveable {
    private int radius;
    private int square;

    public Ball(String size, int price, String color, int radius, int square) {
        super(size, price, color);
        this.radius = radius;
        this.square = square;
    }

    @Override
    public String move() {
        return "Ball is moving";
    }

    @Override
    public String play() {
        return "Im playing with ball";
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }
}
