/*
 * Created by Alexey Yarkov on 27.09.17
 * Copyright © 2017 Alexey Yarkov. All rights reserved.
 */

public class Motorcycle extends Car {
    private int MaxSpeed;

    public Motorcycle() {
        super(0, " ", " ", 0, 0, 0);
        MaxSpeed = 0;
    }

    public Motorcycle(int id, String model, String country, int year, int v, int price, int maxSpeed) {
        super(id, model, country, year, v, price);
        if (maxSpeed <= 0) System.out.println("Максимальная скорсть не может быть отрицательной");
        else MaxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) System.out.println("Максимальная скорсть не может быть отрицательной");
        else MaxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tMotorcycle{" +
                "MaxSpeed=" + getMaxSpeed() +
                "}\n";
    }
}
