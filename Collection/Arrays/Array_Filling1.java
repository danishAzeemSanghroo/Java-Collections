import java.util.*;
class Array_Filling1
{
	public static void main(String args[])
	{
		int array[] = new int[5];
		int number[];
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i;
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}