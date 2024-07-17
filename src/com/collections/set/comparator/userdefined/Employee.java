package com.collections.set.comparator.userdefined;

import java.util.Comparator;

public class Employee  implements Comparable
{
    private String name;
    private int empNo;
    public Employee(String name, int empNo)
    {
        this.name = name;
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public int compareTo(Object o)
//    {
//        int empId1=this.empNo;
//        Employee emp1=(Employee)o;
//        int empId2=emp1.empNo;
//        if(empId1>empId2)
//        {
//            return 1;
//        }
//        else if(empId1<empId2)
//        {
//            return -1;
//        }
//        else
//            return 0;
//    }
    public String toString()
    {
        return "Name: "+name+", EmpNo: "+empNo;
    }
    public int compareTo(Object o)
    {
        Integer empId=this.getEmpNo();
        Employee e = (Employee)o;
        Integer empId2=e.getEmpNo();
        return empId.compareTo(empId2);

    }
}
