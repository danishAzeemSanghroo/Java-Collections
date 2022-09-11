import java.util.*;
class Add_List_Names{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Danish");
		list.add("Tahir");
		list.add("Ovais");
		list.add("Anees");
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}