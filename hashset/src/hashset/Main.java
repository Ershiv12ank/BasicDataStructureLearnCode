package hashset;

import java.util.*;

public class Main {
      public static void main(String[] args) {
    	  HashSet hs = new HashSet();
    	  hs.add("shivank");
    	  hs.add(100);
    	  ArrayList list = new ArrayList();
    	  list.add(12);
    	  list.add(340);
    	  hs.addAll(list);
    	  
    	  System.out.println(hs);
    	  hs.remove(100);
    	  System.out.println(hs);
      }
}
