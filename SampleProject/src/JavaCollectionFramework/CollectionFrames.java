package JavaCollectionFramework;

import java.util.Objects;

class Student{
	public String name;
	public int rollno ;
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno +  "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	
	
	
}
public class CollectionFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Nikhil", 1);
		System.out.println(s1);

	}

}
