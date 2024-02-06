package arraylist;

public class Test
{
    static  int x=value2(18);
    static {
        System.out.println("static block");

    }
    public  int a=value(10);//This is first non-static initializer
    public  String s;
    //This is second non-static initializer
    {
        System.out.println("Starting of Non static initializer");
        display();
        System.out.println("Ending of Non static initializer");
    }
    public  void display()
    {
        System.out.println("Starting of display method");
        System.out.println(a);
        System.out.println(s);
        System.out.println("Ending of display method");
    }
    public int value(int a)
    {
        System.out.println("Starting of value method");
        System.out.println("Ending of value method");
        return a;
    }
   static public int value2(int a)
    {
        System.out.println("Starting of  static value2 method");
        System.out.println("Ending of static value2 method");
        return a;
    }
    public Test(int a, String s)
    {
        System.out.println(this);
        System.out.println(this.hashCode());
        System.out.println("Starting of parameterized constructor");
        this.a = a;
        this.s = s;
        System.out.println("Ending of parameterized constructor");
    }

    public static void main(String[] args)
    {

        Test t1=new Test(10,"Shubham");
    }
}
