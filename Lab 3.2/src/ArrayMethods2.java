import java.util.Arrays;

public class ArrayMethods2 
{
	public static void main(String[] args)
	{
		String[] list1 = {"A","B","C","D","E","F"};
		String[] list2 = {"G","H","I","J","K","L"};
		for (int i = 0; i <list1.length + list2.length; i++)
		{
			System.out.print(merge(list1.length + list2.length));
		}
	}
	public static String[] merge(String[]list1, String[]list2)
	{		
		String[] list3 = new String(list1.length + list2.length)
		int x = 0;
		int y = 0;
		int z = 0;
		while ((x < list1.length) && (y < list2.length)) 
	      {
	           if (list1[z].compareTo(list2[y]) < 0) 
	           {
	               list3[z] = list1[y];
	               x++;
	           } 
	           else 
	           {
	               list3[z] = list2[y];
	               y++;
	           }
	           z++;
	      }
	      return list3;
	
	}
	
	public static int partition(int[] list)
	{
		return (Integer) 0;

	}

}