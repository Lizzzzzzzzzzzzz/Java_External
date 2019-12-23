package Model.entity;

import Model.Interface.SelfMoveable;

public class Car extends Toy implements SelfMoveable {
    private int maxSpeed;
    private int brand;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    public Car(String size, int price, String color, int maxSpeed, int brand) {
        super(size, price, color);
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }

    @Override
    public String play() {
        return "Im playing with car";
    }

    @Override
    public String move() {
        return "Im moving with car";
    }
}
