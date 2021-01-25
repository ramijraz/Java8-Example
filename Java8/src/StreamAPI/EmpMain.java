package StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Employee {
	private int empno;
	private String name;
	private int age;
	private String loc;
	Employee(int empno,String name,int age,String loc) {
		this.empno = empno;
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	String getLoc() {
		return loc;
	}
	public String toString(){
		return "Employee No: "+empno+" name = "+name+" age = "+age+" location = "+loc;
	}
}
public class EmpMain{
	public static void main(String args[]) {
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(10,"Ram",12,"kolkata"));
		list.add(new Employee(11,"Sam",14,"pune"));
		list.add(new Employee(12,"kamla",16,"burdwan"));
		list.add(new Employee(13,"Ramiz",19,"birbhum"));
		list.add(new Employee(14,"Rohit",22,"pune"));
		
		ArrayList li=(ArrayList)list.stream().filter(e->e.getLoc().equalsIgnoreCase("pune")).collect(Collectors.toList());
		li.forEach(m->System.out.println(m));
	}
}
