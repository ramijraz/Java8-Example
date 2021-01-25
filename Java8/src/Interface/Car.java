package Interface;

interface Vehicle {
	default void message() {
		System.out.println("Inside Vehicle");
	}
}

interface FourWheeler {
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
class Car1 implements Vehicle,FourWheeler {
	public void message() {
			Vehicle.super.message();
		}
	}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c=new Car1();
		c.message();
	}

}
