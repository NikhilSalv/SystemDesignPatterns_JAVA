package Nikhil;

@FunctionalInterface
interface A{
	 void show();
}



public class LambdaDemo {

	public static void main(String[] args) {
		
//		A obj = new A() {
//			public void show() {
//				System.out.println("In Show A");
//			}
//		};
		A obj = () -> System.out.println("In Show A");
		obj.show();
		// TODO Auto-generated method stub
	}

}
