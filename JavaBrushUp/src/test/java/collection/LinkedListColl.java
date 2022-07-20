
package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("TATA");
		
		System.out.println(cars);
		
		//add element at specific location
		cars.add(2,"Maruti");
		System.out.println(cars);
		cars.addFirst("Merc");
		System.out.println(cars);
		Iterator x=cars.descendingIterator();
		while(x.hasNext())
		{
			System.out.println("Value is "+ x.next());
		}
		cars.offer("Mustang");
		System.out.println(cars);
		System.out.println(cars.peek());
		System.out.println(cars.peekLast());
		System.out.println(cars.remove(2));
		System.out.println(cars);
		
		
	}

}
