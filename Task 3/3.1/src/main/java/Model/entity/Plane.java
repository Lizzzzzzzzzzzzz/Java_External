package Model.entity;

import Model.Interface.SelfMoveable;

public class Plane extends Toy implements SelfMoveable {
    private int countOfPassengers;
    private int lenOfFlying;

    public Plane(String size, int price, String color, int countOfPassengers, int lenOfFlying) {
        super(size, price, color);
        this.countOfPassengers = countOfPassengers;
        this.lenOfFlying = lenOfFlying;
    }


    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    public int getLenOfFlying() {
        return lenOfFlying;
    }

    public void setLenOfFlying(int lenOfFlying) {
        this.lenOfFlying = lenOfFlying;
    }

    @Override
    public String move() {
        return null;
    }


    @Override
    public String play() {
        return null;
    }
}
