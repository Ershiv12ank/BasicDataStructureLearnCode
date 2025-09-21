package in.ds.arraylist;
import java.lang.*;
import java.util.ArrayList;

public class ArraylistBasic {


	public static void main(String[] args) {
		// Create a array  List
		ArrayList<Integer> list = new ArrayList<>();
		
		// Add element in arraylist.
		list.add(23);
		list.add(45);
		list.add(47);
		list.add(35);
		list.add(27);
		list.add(4);
		list.add(3);
		list.add(5);
		System.out.println(list);
		// add element in the index.
		list.add(2, 32);
		System.out.println(list);
		
		// get element
		System.out.println(list.get(1));
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Shivank");
		name.add("Kamana");
		name.add("Umesh");
		name.add(3,"hero");
		System.out.println(name);
		
	
		
		
      
	}

}
