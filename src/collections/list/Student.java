package collections.list;

public class Student implements Comparable
{
    private String name;
    private int age;
    private  int rollNo;
    private String address;
    private String phoneNumber;

    public Student(String name, int rollNo, int age, String phoneNumber, String address)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Student)
        {
            Student s = (Student)obj;
            return s.name.equals(name) &&s.rollNo == this.rollNo;
        }
        return false;
    }
    public String toString()
    {
        return "Name: " + name + ", Age: " + age + ", Roll No: " + rollNo + ", Address: " + address;
    }
    public  int hashCode()
    {
        return rollNo+name.hashCode();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int compareTo(Object o)
    {
        Student s=(Student) o;
        return this.name.compareToIgnoreCase(s.name);
    }
}
