import java.util.*;
class Arra_Char_input
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		char[] array = new char[6];
		char[] name = new char[array.length];
		for(int i = 0; i < array.length; i++)
		{
			name[i] = ob.next().charAt(0);
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(name[i]);
		}
	}
}