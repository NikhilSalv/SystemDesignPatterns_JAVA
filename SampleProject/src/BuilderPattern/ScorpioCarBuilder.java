package BuilderPattern;

public class ScorpioCarBuilder implements ICarBuilder {
	

	Scorpio s1 = new Scorpio();
	
	

	@Override
	public void withEngine() {
		// TODO Auto-generated method stub
		System.out.println("Scorpio Engine getting insterted");
		s1.setEngine("Scorpio Engine");
		
	}

	@Override
	public void withTyre() {
		// TODO Auto-generated method stub
		System.out.println("Scorpio Tyre getting insterted");
		s1.setTyre("Scorpio Tyre");
		
		
	}
	
	@Override
	public void withBodyShell() {
		// TODO Auto-generated method stub
		System.out.println("Scorpio BodyShell getting insterted");
		s1.setBodyShell("Scorpio Body Shell");
		
	}

	@Override
	public void withChassis() {
		System.out.println("Scorpio Chassis getting insterted");
		s1.setChassis("Scorpio Chassis");
		
	}


	@Override
	public ICar build() {
		// TODO Auto-generated method stub
		System.out.println("Scorpio is readyyyyy!!!!");
		return s1;
	}
	



}
