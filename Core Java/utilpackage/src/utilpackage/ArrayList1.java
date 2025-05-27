package utilpackage;

import java.util.*;

public class ArrayList1 {

   public static void main(String[] args) {
	    ArrayList<String>stuff = new ArrayList<String>();
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("ksjdk");
		stuff.add("Aspen");
		stuff.add("Aelluride");
		System.out.println("Unsorted"+stuff);
		Collections.sort(stuff);
		System.out.println("Sorted : "+stuff);
		for(String x : stuff) {
			System.out.println(x);
		}
	}
}
