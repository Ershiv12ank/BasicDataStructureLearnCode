package in.dsa.question;

public class ansntron {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int m = n;
		int num = 0;
        while(n > 0) {
            int m = n % 10;
            System.out.println(m);
            num = num + (m*m*m);
            System.out.println(m*m*m);
            n /= 10;
        }
        System.out.println(num);
        System.out.println(n);
        boolean is = m == num;
        System.out.println(is);
        

	}

}
