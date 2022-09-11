import java.util.*;
class Max_Min_Number
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		double array[] = new double[5];
		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Enter " + (i+1) + " value: ");
			array[i] = ob.nextDouble();
		}
		double largest = array[0];
		double smallest = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > largest)
			{
				largest = array[i];
			}
		}
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < smallest)
			{
				smallest = array[i];
			}
		}
		System.out.println("Largest = " + largest + "\nSmallest = " + smallest);
	}
}