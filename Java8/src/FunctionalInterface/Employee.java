package FunctionalInterface;
import java.util.ArrayList;
import java.util.function.Function;

public class Employee {
	private int empno;
	private String name;
	private int age;
	private String location;
	
	
	Employee(int empno,String name,int age,String loc){
		this.empno=empno;
		this.name=name;
		this.age=age;
		this.location=loc;
	}
	String getLocation() {
		return location;
	}
	public String toString() {
		return "Employee No: "+empno+" Nmae: "+name+" Age: "+age+" Location: "+location;
	}
}
