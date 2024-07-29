package BuilderPattern;

public interface ICarBuilder {
	
	public void withEngine();
	public void withTyre();
	public void withBodyShell();
	public void withChassis();
	
	public ICar build(); 
	

}
