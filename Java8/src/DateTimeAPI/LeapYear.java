package DateTimeAPI;
import java.time.LocalDate;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		if(date.isLeapYear()) {
			System.out.println("Current year is leap year");
		}else {
			System.out.println("Current year is not leap year");
		}
	}

}
