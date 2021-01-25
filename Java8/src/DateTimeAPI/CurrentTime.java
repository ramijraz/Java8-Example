package DateTimeAPI;
import java.time.LocalTime;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("Current Time : "+time);
		System.out.println("Time after 25 minutes is : "+time.plusMinutes(25));
	}

}
