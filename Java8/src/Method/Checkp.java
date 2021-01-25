package Method;

interface CheckPrime{
	void primecheck(int n);
}

public class Checkp {
	Checkp(int m){
		int f=0;
		for(int i=2;i<=m;i++) {
			if(m%i==0) {
				f=1;
			}
		}
		if(f==0) {
			System.out.println("Prime");
		}else {
			System.out.println("Non-Prime");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPrime cp=Checkp :: new;
		cp.primecheck(8);
		cp.primecheck(7);
	}

}
