// 1.	Create an ArrayList<Integer> and add numbers 1–10. Print them using iterator.
package in.ds.arraylist;
import java.util.*;

public class Program01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list.add(i);
		}
		
		Iterator<Integer> str = list.iterator();
		while(str.hasNext()) {
			System.out.print(str.next() + ", ");
		}
		

	}

}
