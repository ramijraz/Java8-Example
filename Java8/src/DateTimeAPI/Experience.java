package DateTimeAPI;
import java.time.LocalDate;
import java.time.Period;

public class Experience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dateofjoin=LocalDate.of(2020, 01, 01);
		Period d=Period.between(dateofjoin,LocalDate.now());
		int years=d.getYears();
		int days=d.getDays();
		int months=d.getMonths();
		System.out.println("Experience : "+years+" Years "+months+" Months "+days+" Days");
	}

}
