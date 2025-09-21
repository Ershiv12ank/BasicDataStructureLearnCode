// 2.	Remove even numbers from the list.
package in.ds.arraylist;
import java.util.*;
public class Program02 {

	public static void main(String[] args) {
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(4);
		list2.add(5);
		list2.add(2);
		list2.add(7);
		list2.add(9);
		
		list2.removeIf(n -> n%2==0);
		System.out.println(list2);

	}


}
