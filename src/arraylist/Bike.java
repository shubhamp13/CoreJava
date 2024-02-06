package arraylist;

public class Bike
{
    public String name;
    public String modelName;
    public double cc;
    public double price;

    public Bike()
    {

    }

    public Bike(String name, String modelName, double cc, double price)
    {
        this.name = name;
        this.modelName = modelName;
        this.cc = cc;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", modelName=" + modelName + ", cc=" + cc + ", price=" + price + "]";
    }



}
