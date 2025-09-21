package in.rec;
class fibo{
public int fibofn(int n) {
	if(n <= 1) {
		return n;
	}
	
	return fibofn(n-1) + fibofn(n-2);
}
}
public class Recusion1 {
	public static void main(String[] args) {
		fibo fib = new fibo();
		int res = fib.fibofn(5);
		System.out.println(res);
		
	}

}
