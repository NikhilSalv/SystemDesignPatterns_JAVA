package ProxyPattern;

public class RemoteProxy implements ICar{
	
	ICar scorpioCarObj = new RCScorpio();
	

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		scorpioCarObj.turnLeft();
		
	}

	@Override
	public void turnRigh() {
		// TODO Auto-generated method stub
		scorpioCarObj.turnRigh();
	}

	@Override
	public void goStraight() {
		// TODO Auto-generated method stub
		scorpioCarObj.goStraight();
		
	}
	

}
