package arraylist;


import java.util.ArrayList;
public class EvenArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(12);
        numbers.add(33);
        numbers.add(26);
        numbers.add(17);
        numbers.add(22);
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<numbers.size();i++)
        {
            int a=numbers.get(i);
            if(a%2==0)
            {
                 even.add(a);
            }
        }
        numbers.removeAll(even);
        System.out.println(numbers);
    }

}