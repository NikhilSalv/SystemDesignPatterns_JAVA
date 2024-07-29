package BuilderPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICarBuilder builder = new ScorpioCarBuilder();
		
//		builder.withChassis();
//		builder.withTyre();
		Director director = new Director(builder);
		
		
		director.construct();
		
		ICar car1 = builder.build();
		
		System.out.println(car1.toString());


//		

	}

}
