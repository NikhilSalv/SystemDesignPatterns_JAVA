package BuilderPattern;

public class FortunerBuilder implements ICarBuilder {
	

	Fortuner s2;
	@Override
	public void withEngine() {
		// TODO Auto-generated method stub
		System.out.println("Fortuner Engine getting insterted");
		
	}

	@Override
	public void withTyre() {
		// TODO Auto-generated method stub
		System.out.println("Fortuner Tyre getting insterted");
		
	}
	
	@Override
	public void withBodyShell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withChassis() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ICar build() {
		// TODO Auto-generated method stub
		return s2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}


}
