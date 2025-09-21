package hashing;

import java.util.HashSet;
import java.util.*;

public class basic {

	public static void main(String[] args) {
	 HashSet<Integer> map1 = new HashSet<>();
	 map1.add(2);
	 map1.add(3);
	 map1.add(3);
	 map1.add(1);
	 
	 if(map1.contains(2)) {
		 System.out.println("Element present in set");
	 }
	 
	 else if(!map1.contains(4)) {
		 System.out.println("ELement is not present");
	 }
	 
	 map1.remove(1);
	 System.out.println(map1);

	}
	
	Iterator<Integer> itr = map1.iterator();
   
    while(itr.hasNext()) {
        System.out.println(itr.next());
    }
	
}
