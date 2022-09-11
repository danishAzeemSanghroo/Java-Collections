import java.util.*;
class LinkedList
{
	public static void main(String args[])
	{
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("Danish");
		link.add("Ayaz");
		link.add("Ayoub");
		
		Iterator<String> itr = link.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
    }
}