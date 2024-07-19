package com.newupdates.predefinedfunctionalinterfaces.function;

public class Employee
{
    private String empName;
    private  double salary;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public boolean equals(Object o)
    {
        if (this==o)return true;
        if(o instanceof  Employee)
        {
            Employee e=(Employee) o;
            return e.salary==salary&&e.empName.equals(empName);
        }
        return false;

    }
    public int hashCode()
    {
        return empName.hashCode()+(int)salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
