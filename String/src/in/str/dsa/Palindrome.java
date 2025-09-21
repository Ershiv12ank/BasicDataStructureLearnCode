package in.str.dsa;

public class Palindrome {
	public static void main(String[] args) {
		String s = "abba";
        int n = s.length();
        String s1 = s;
        String s2 = "";
        for(int i =n-1; i >= 0; i--) {
            s2 = s2 + s.charAt(i);
        }

        	System.out.println(s1==s2);
        }
	}


