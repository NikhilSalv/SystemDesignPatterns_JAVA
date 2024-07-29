package PrototypePatternRevised;

public class RemoteProxy implements ICarRevised{
	
	ICarRevised scorpioObj = new RCScorpioRevised();

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		scorpioObj.turnLeft();
		
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		scorpioObj.turnRight();
		
	}

	@Override
	public void goStaright() {
		// TODO Auto-generated method stub
		scorpioObj.goStaright();
		
	}
	

}
