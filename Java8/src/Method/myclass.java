package Method;

interface Intfact{
	int fact(int n);
}

public class myclass {

	int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myclass ob=new myclass();
		Intfact ref=ob::factorial;
		System.out.println(ref.fact(5));
		System.out.println(ref.fact(6));
	}
}
