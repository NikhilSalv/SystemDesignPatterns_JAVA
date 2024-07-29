package DecoratorPattern;

public interface ICar {
	
	int baseWeight = 1500;
	
	public void start();
	
	public void stop();
	
	public int getWeight();

}
