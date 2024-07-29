package Nikhil;

enum Status {
	Running, Failed, Success, Surface;
//	private int price;
	
}

public class EnumClass {

	public static void main(String[] args) {
		
		Status s =  Status.Failed;
		
		System.out.println(s.ordinal());
		
		Status[] ss = Status.values();
		// TODO Auto-generated method stub
		
		for(Status a : ss) {
			System.out.println(a);
		};

	}

}
