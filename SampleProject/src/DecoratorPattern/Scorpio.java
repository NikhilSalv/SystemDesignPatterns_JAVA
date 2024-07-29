package DecoratorPattern;

public class Scorpio implements ICar{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		System.out.println("Scorpio Started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
		System.out.println("Scorpio Stopped");
		
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return baseWeight;
	}
	
	

}
