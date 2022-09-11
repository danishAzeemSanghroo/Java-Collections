import java.util.*;
class ForEachLoop
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		double total = 0;
		double array[] = {1,2,3,4,5};
		for(double number : array)
		{
			total += number;
		}
		System.out.println("Sum = " + total + "\nAverage = " + total/array.length);
	}
}