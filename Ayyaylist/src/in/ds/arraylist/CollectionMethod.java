package in.ds.arraylist;
import java.util.ArrayList;
public class CollectionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList item = new ArrayList();
		
		// Add method: add object in collection.
		item.add(10);
		item.add(34);
		item.add(55);
		
		
		System.out.println(item);
		
		ArrayList item2 = new ArrayList();
		item2.add("aaa");
		item2.add("bbb");
		item2.add("ccc");
		
		System.out.println(item2);
		
		// addall : it is used to add collection in the list.
		item.addAll(item2);
		System.out.println(item);
		
		

	}

}
