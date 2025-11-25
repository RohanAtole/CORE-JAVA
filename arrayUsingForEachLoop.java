package OOPS;

class student1{
	int rollno;
	String name;
	int marks;
}

public class arrayUsingForEachLoop{
	
	public static void main(String args[]) {
		
		student1 s1 = new student1();
		s1.rollno = 1;
		s1.name = "Rohan";
		s1.marks = 98;
		
		student1 s2 = new student1();
		s2.rollno = 2;
		s2.name = "Dhiraj";
		s2.marks = 48;
		
		student1 s3 = new student1();
		s3.rollno = 3;
		s3.name = "Pratham";
		s3.marks = 95;
		
		
		//we create the array which can hold student reference
		student1 students[] = new student1[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(student1 stud : students) {
			System.out.println(stud.name +" : "+stud.marks);
		}
	}
}
