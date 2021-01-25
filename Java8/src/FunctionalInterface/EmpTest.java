package FunctionalInterface;
import java.util.ArrayList;
import java.util.function.Function;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(101, "Sachin", 35, "Jaipur"));
		list.add(new Employee(102, "Kohli", 40, "Pune"));
		list.add(new Employee(103, "Dhoni", 30, "Ranchi"));
		list.add(new Employee(104, "Raina", 25, "Kanpur"));
		list.add(new Employee(105, "Rahul", 29, "Lucknow"));
		
		Function<ArrayList<Employee>, ArrayList<String>> func = ( all )-> {
			ArrayList<String> locations = new ArrayList<>();
			for(Employee e : all){
				locations.add(e.getLocation());
			}
			return locations;
		};
		
		System.out.println(func.apply(list));
	}

}
