package utilpackage;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.add("F");
		ll.add("D");
		ll.add("S");
		ll.add("D");
		ll.add("H");
		ll.add("J");
		ll.add("K");
		ll.add(1,"B");
		ll.addFirst("A");
		ll.addLast("Z");
		System.out.println("Original Contents of ll:"+ll);
		ll.remove("F");
		ll.remove(3);
		System.out.println("Contents of ll after operation"+ll);
		ll.removeFirst();
		ll.removeLast();
        System.out.println("Contents after deletion first and last:"+ll);	
	}
}
