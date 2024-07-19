package com.newupdates.predefinedfunctionalinterfaces.bifunction;

public class Car
{
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj instanceof Car)
        {
            Car car = (Car) obj;
            return model.equals(car.getModel()) && price == car.getPrice();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}
