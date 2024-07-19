package com.newupdates.predefinedfunctionalinterfaces.biconsumer;

public class Order
{
    private String orederId;
    private double price;

    public Order(String orederId, double price) {
        this.orederId = orederId;
        this.price = price;
    }

    public String getOrederId() {
        return orederId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orederId='" + orederId + '\'' +
                ", price=" + price +
                '}';
    }

    public void setOrederId(String orederId) {
        this.orederId = orederId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean equals(Object o)
    {
        if(this==o)return false;
        if(o instanceof Order)
        {
            Order a=(Order) o;
            return orederId.equals(a.orederId);
        }
        return false;
    }
    public  int hashCode()
    {
        return orederId.hashCode();
    }
}
