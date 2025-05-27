import java.util.*;
public class ArrayListsample{
public static void main(String args[]) {
	ArrayList al = new ArrayList();
	System.out.println("Initial size of al:"+al.size());
	al.add("C");
	al.add("A");
	al.add(6);
	al.add("B");
	al.add("D");
	al.add("F");
	al.add("A");
	al.add("A");
	al.add("D");
	al.add("E");
	System.out.println("Size of al after additions:"+al.size());
	System.out.println(al);
	al.remove("D");
	al.remove(3);
	System.out.println("After removal:"+al);
	System.out.println(al.get(5));
	System.out.println("contents of al:"+ al);
	for(int i=0;i < al.size();i++)
	{
		System.out.println("Normal for:"+al.get(i));
	}
		Iterator it = al.iterator();
				while(it.hasNext()) 
				{
					System.out.println("Using Iterator:"+it.next());
				}
		for(Object x:al)
		{
			System.out.println("Using Enhanced Enumerator:"+x);
		}
	}
	}


