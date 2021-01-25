package DateTimeAPI;
import java.time.LocalTime;

public class BeforeTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time=LocalTime.now();
		System.out.println("Time now : "+time);
		System.out.println("Time before 5 hours and 30 minutes : "+time.minusHours(5).minusMinutes(30));
	}

}
