package in.ds.arraylist;
import java.util.*;

public class list {
    public static void main(String[] args) {
    	List l = new ArrayList();
    	l.add(12);
    	l.add(13);
    	l.add(14);
    	Iterator i = l.iterator();
    	
    	while( i.hasNext()) {
    		System.out.println(i.next());
    	}
    	
    }
}
