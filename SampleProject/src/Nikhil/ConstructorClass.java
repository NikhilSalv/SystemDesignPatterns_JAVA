package Nikhil;


class Mobile{
	
	String brand;
	int price;
	static String camera;
	
	static {
		camera = "poi";
		
	}
	
	public Mobile()
	{
		brand= "Default";
		price =122;
		
	}
}


public class ConstructorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile cell = new Mobile();
		cell.brand = "changed";
		System.out.println(cell.camera);
		

	}

}
