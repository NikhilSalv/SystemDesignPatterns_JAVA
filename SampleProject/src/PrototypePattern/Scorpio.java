package PrototypePattern;

public class Scorpio implements IScorpioPrototype {
	
	ScorpioEngine engine;
	
	public Scorpio() {
		
		this.engine = new ScorpioEngine();
	}
	
	private Scorpio(ScorpioEngine engineObject) {
		
		this.engine = engineObject;
	}
	
	
	
	public void setEngine(ScorpioEngine eng) {
		this.engine = eng;
	}
	
	public ScorpioEngine getEngine() {
		return engine;
	}
	
	public void start() {
		
	};
	
	public IScorpioPrototype clone() {
		return new Scorpio(this.engine);
	}
}
