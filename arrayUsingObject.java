package OOPS;

class student{
	int rollno;
	String name;
	int marks;
}

public class arrayUsingObject{
	
	public static void main(String args[]) {
		
		student s1 = new student();
		s1.rollno = 1;
		s1.name = "Rohan";
		s1.marks = 98;
		
		student s2 = new student();
		s2.rollno = 2;
		s2.name = "Dhiraj";
		s2.marks = 48;
		
		student s3 = new student();
		s3.rollno = 3;
		s3.name = "Pratham";
		s3.marks = 95;
		
		
		//we create the array which can hold student reference
		student students[] = new student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(int i=0; i<students.length;i++) {
			System.out.println(students[i].name +" : "+students[i].marks);
		}
	}
}
