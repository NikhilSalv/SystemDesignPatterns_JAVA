package AdapterPattern;

public class Adapter implements ICar{
	
	@Override
	public String toString() {
		return "Adapter [balloon=" + balloon + "]";
	}



	HotAirBalloon balloon;

	public Adapter(HotAirBalloon balloon) {
		super();
		this.balloon = balloon;
	}
	
	

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
		String gasToBeUsed = balloon.getGas();
		
		balloon.start(gasToBeUsed);
		
	}

}
