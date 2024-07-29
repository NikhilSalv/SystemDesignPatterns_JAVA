package PrototypePattern;

public interface IScorpioPrototype {
	
	
	public IScorpioPrototype clone();
	
	
	public void setEngine(ScorpioEngine scorpioEngine);
	
	public void start();
	
	public ScorpioEngine getEngine();
	
}
