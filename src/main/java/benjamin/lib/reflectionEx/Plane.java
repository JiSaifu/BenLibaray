package benjamin.lib.reflectionEx;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by jisai on 2017/07/15.
 */

public class Plane {
    static {
        System.out.println("Hello, This is Plane Class.");
    }

    private String brand;
    private String color;
    private int maxSpeed;



    public Plane() {}

    public void introduce() {
        System.out.println("Brand:" + this.getBrand() +
                " Color:" + this.getColor() +
                " MaxSpeed:" + this.getMaxSpeed());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
