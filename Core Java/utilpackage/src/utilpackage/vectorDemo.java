package utilpackage;
import java.util.*;
public class vectorDemo{

	public static void main(String[] args) {
		Vector as = new Vector();
		System.out.println("Initial size of a1:"+as);
		as.add("C");
		as.add("A");
		as.add(6);
		as.add("B");
		as.add("D");
		as.add("F");
		as.add("A");
		as.add("A");
		as.add("D");
		as.add("E");
		System.out.println("Size after add"+as.size());
        System.out.println("Contents of array:"+as);
        as.remove("F");
        as.remove("2");
        System.out.println("Size after deletion:"+as.size());
        System.out.println("Contents of array:"+as);
	}

}
