package StreamAPI;
import java.util.ArrayList;
import java.util.Arrays;

class Student {
	private int roll;
	private String name;
	private float marks;
	
	Student(int roll,String name,float mark) {
		this.roll=roll;
		this.name=name;
		this.marks=mark;
	}
	
	float getMark() {
		return marks;
	}
}
public class StudentGrade {
	public static void main(String args[]) {
	ArrayList<Student> list = new ArrayList<>();
	list.add(new Student(101, "Sachin", 85));
	list.add(new Student(102, "Kohli", 80));
	list.add(new Student(103, "Dhoni", 40));
	list.add(new Student(104, "Raina", 95));
	list.add(new Student(105, "Rahul", 49));
	
	long count=list.stream().filter(s->s.getMark()>=50).count();
	System.out.println(count);
	}
}
