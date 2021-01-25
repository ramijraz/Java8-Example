package Foreach;
import java.util.*;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> day=new ArrayList<String>();
		day.add("Sunday");day.add("Monday");
		day.add("Tuesday");day.add("Wednesday");
		day.add("Thursday");day.add("Friday");
		day.add("Saturday");
		
		day.forEach(name-> System.out.println(name));
	}

}
