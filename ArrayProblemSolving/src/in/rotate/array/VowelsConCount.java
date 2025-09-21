package in.rotate.array;

public class VowelsConCount {

	public static void main(String[] args) {
		String str = "fkjhfaighjsjfjfj";
		int vowelCount = 0;
		int con_count=0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) =='a' || str.charAt(i) =='A' ||str.charAt(i) =='e' || str.charAt(i) =='E' ||str.charAt(i) =='i' || str.charAt(i) =='I' ||str.charAt(i) =='o' || str.charAt(i) =='O' ||str.charAt(i) =='u' || str.charAt(i) =='U') {
				vowelCount++;
			}
			else {
				con_count++;
			}
		}
		System.out.println("Vowels count : " + vowelCount + " Consunent count "+ con_count );

	}

}
