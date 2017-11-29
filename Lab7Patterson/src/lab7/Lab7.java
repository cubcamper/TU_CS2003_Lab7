/**
 * @author george-patterson
 */

package lab7;
import java.util.*;

public class Lab7 {

	public static void main(String[] args) {
		
		//use linked list class to create two linked list
		LinkedList<String> cities = new LinkedList<String>();
		LinkedList<String> zip = new LinkedList<String>();
		
		//add names of cities to first linked list
		cities.add("Tulsa");
		cities.add("Ada");
		cities.add("Broken Arrow");
		cities.add("Owasso");
		
		//add "OKC" as second element in first linked list
		cities.add(1,"OKC");
		
		//add elements to second linked list
		zip.add("74104");
		zip.add("74135");
		zip.add("foo");
		zip.add("hello world");
		zip.add("777");
		
		printList(cities);
		printList(zip);
		
		//merge elements from second list to first list
		merge(cities,zip);

		//remove every second word from the first list
		removeEverySecond(cities);
		
		
		//make deep copy of second list	
		LinkedList<String> deepCopyOfZip = deepCopy(zip);
	
		
		
	}
	
	public static void removeEverySecond(LinkedList<String> l) {
		Iterator<String> iterl = l.iterator();
		
	}
	
	public static LinkedList<String> deepCopy(LinkedList<String> l) {
		LinkedList<String> deepCopy = new LinkedList<String>();
		Iterator<String> iterl = l.iterator();
		while (iterl.hasNext()) {
			deepCopy.add(iterl.next());
		}
		return deepCopy;
	}
	
	
	public static void merge(LinkedList<String> l1, LinkedList<String> l2) {
		Iterator<String> iterl1 = l1.iterator();
		Iterator<String> iterl2 = l2.iterator();
		
	}
	
	public static void printList(LinkedList<String> linkedList) {
		Iterator<String> iter = linkedList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
