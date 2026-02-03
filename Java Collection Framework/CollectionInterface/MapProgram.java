package JCF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}

public class MapProgram{
	public static void main(String args[]) {
		
		//lambda Expression
		
		Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;
					
		List<Student> studs = new ArrayList<> ();
		studs.add(new Student(21, "Rohan"));
		studs.add(new Student(34, "Dhiraj"));
		studs.add(new Student(54, "Pratham"));
		studs.add(new Student(23, "Omkar"));
		
		Collections.sort(studs, com);
		
		for(Student s : studs)
			System.out.println(s);
	}
}

