package in.ds.arraylist;
import java.util.*;
public class problem01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		ArrayList<String> name = new ArrayList<>();
		
		for(int i = 0 ; i< n ; i++) {
			name.add(scan.nextLine());
		}
		
		for(String str: name) {
			System.out.print(str + ", ");
		}

	}

}
