import java.util.*;
class Array_Filling2
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		String[] array = new String[5];
		String[] input = new String[array.length];
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("\nEnter " + (i+1) + "Name: ");
			input[i] = ob.nextLine();
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(input[i]);
		}
	}
}