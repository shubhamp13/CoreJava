package arraylist;
import java.util.ArrayList;
public class BikeDriver
{
        public static void main(String[] args)
        {
            ArrayList<Object> bikes = new ArrayList<Object>();
            bikes.add(new Bike("Yamaha", "R15", 150.00, 150000.00));
            bikes.add(new Bike("Royal Enfield", "GT 650", 647.00, 750000.00));
            bikes.add(new Bike("Royal Enfield", "Classic 350", 350.00, 350000.00));
            bikes.add(new Bike("Bajaj", "R15", 150.00, 150000.00));
            bikes.add(new Bike("Yamaha", "R1", 1000.00, 50000.00));

            ArrayList<ArrayList<Bike>> uniqueBrandLists = groupByBrand(bikes);

            // Print the bikes for each unique brand
            for (ArrayList<Bike> brandBikes : uniqueBrandLists) {
                for (Bike bike : brandBikes) {
                    System.out.println(bike);
                }
                System.out.println();
            }
        }

        public static ArrayList<ArrayList<Bike>> groupByBrand(ArrayList<Object> b)
        {
            ArrayList<ArrayList<Bike>> uniqueBrandLists = new ArrayList<>();
            for (Object o : b)
            {
                Bike bike = (Bike) o;
                String brand = bike.name;
                boolean found = false;
                // Check if the brand already has a list
                for (ArrayList<Bike> brandBikes : uniqueBrandLists)
                {
                    if (!brandBikes.isEmpty() && brandBikes.get(0).name.equals(brand)) {
                        brandBikes.add(bike);
                        found = true;
                        break;
                    }
                }
                // If brand not found, create a new list for the brand
                if (!found) {
                    ArrayList<Bike> newBrandList = new ArrayList<>();
                    newBrandList.add(bike);
                    uniqueBrandLists.add(newBrandList);
                }
            }
            return uniqueBrandLists;
        }
    }


//	public static String [] unique(ArrayList<Object> b)
//	{
//		int []freq=new int[b.size()];
//		String []brand=new String[b.size()];
//		int k=0;
//		for(Object o:b)
//		{
//			Bike c=(Bike)o;
//			brand[k++]=c.name;
//		}
//
//		for(int i=0;i<brand.length-1;i++)
//		{
//			int ct=0;
//			for(int j=i+1;j<brand.length;j++)
//			{
//				if(brand[i].equals(brand[j]))
//				{
//					++ct;
//					freq[j]=-1;
//				}
//			}
//			if(freq[i]!=-1)
//			{
//				freq[i]=ct;
//			}
//		}
//		int unique=0;
//		for(int ct:freq)
//		{
//			if(ct!=-1)
//			{
//				++unique;
//			}
//		}
//		String []uniqueBrand=new String[unique];
//		for(int i=0,j=0;i<brand.length;i++)
//		{
//			if(freq[i]!=-1)
//			{
//				uniqueBrand[j++]=brand[i];
//			}
//		}
//		return uniqueBrand;
//	}


