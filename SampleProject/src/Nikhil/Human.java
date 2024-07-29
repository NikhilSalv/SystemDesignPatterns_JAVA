package Nikhil;

class BluePrintHuma {
	
	private int age;
	private String name;
	
	
	

	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
}  




public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BluePrintHuma obj = new BluePrintHuma();
		obj.setAge(9);
		obj.setName("Nikhil");
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		

	}

}
