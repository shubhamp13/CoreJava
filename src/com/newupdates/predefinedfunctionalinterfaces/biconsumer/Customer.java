package com.newupdates.predefinedfunctionalinterfaces.biconsumer;

public class Customer
{
    private String custName;
    private String custEmail;

    public Customer( String custName,String custEmail) {
        this.custEmail = custEmail;
        this.custName = custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custEmail='" + custEmail + '\'' +
                ", custName='" + custName + '\'' +
                '}';
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }
    public boolean equals(Object o)
    {
        if(this == o)return false;
        if(o instanceof Customer)
        {
            Customer c=(Customer) o;
            return custName.equals(c.custName)&&custEmail.equals(c.custEmail);
        }
        return false;
    }
    public int hashCode()
    {
        return custEmail.hashCode()+custName.hashCode();
    }

}
