package Foreach;
import java.util.*;

class Emp{
	int id;
	double sal;
	String adr,name;
	
	Emp(int id,double sal,String name,String adr){
		this.id=id;
		this.adr=adr;
		this.name=name;
		this.sal=sal;
	}
}

public class Employee {
	public static void main(String args[]) {
		
		Emp emp1=new Emp(1,100,"ram","kolkata");
		Emp emp2=new Emp(2,300,"sam","burdwan");
		Emp emp3=new Emp(3,500,"Madhu","Hoogly");
		
	ArrayList <Emp> emplist=new ArrayList<Emp>();
	emplist.add(emp1);
	emplist.add(emp2);
	emplist.add(emp3);
	emplist.forEach(emp->System.out.println("ID : "+emp.id+" Name : "+emp.name+" Address : "+emp.adr+" Salary : "+emp.adr));
	}
}
