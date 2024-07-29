package BuilderPattern;

public class Director {
	
	ICarBuilder carBuilder;
	

	public Director(ICarBuilder carBuilder) {
		super();
		this.carBuilder = carBuilder;
	}
	
	public void construct() {
		carBuilder.withEngine();
		carBuilder.withTyre();
		carBuilder.withBodyShell();
		carBuilder.withChassis();
	}


}
