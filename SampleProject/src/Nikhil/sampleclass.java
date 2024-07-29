package Nikhil;

class Student {
	int marks;
	String name;
	int rollno;
	
}

public class sampleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.marks = 100;
		std1.name = "Nikhil";
		std1.rollno = 12;
		
		Student std2 = new Student();
		std2.marks = 100;
		std2.name = "Nikhil";
		std2.rollno = 12;
		
		Student std3 = new Student();
		std3.marks = 100;
		std3.name = "Nikhil";
		std3.rollno = 12;
		
		
		Student stdarr[] = new Student[3];
		stdarr[0] = std1;
		stdarr[1] = std2;
		stdarr[2] = std3;
		
		int obj = 3;
		System.out.println(obj);
		

		for(Student s: stdarr) {
			System.out.println(s.name + " : " +  s.marks);
			
		}
		

	}

}
