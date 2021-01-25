package Method;

interface digitcount{
	int countDigit(int n);
}

public class Counter {
	
	static int digitCount(int n) {
		int p=0;
		while(n>0) {
			p+=1;
			n=n/10;
		}
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		digitcount dc=Counter::digitCount;
		System.out.println(dc.countDigit(5342));
		System.out.println(dc.countDigit(32));
	}

}
