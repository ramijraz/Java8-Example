package Interface;
interface Test{
	int myFunction(int x,int y,int z);
}
public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=(x,y,z)->(x+y+z);
		Test t2=(x,y,z)->(x*y*z);
		System.out.println("Result1: "+t1.myFunction(10,20,30));
		System.out.println("Result1: "+t2.myFunction(40,50,10));
	}

}
