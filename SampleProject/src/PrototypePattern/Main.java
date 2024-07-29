package PrototypePattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IScorpioPrototype prototype = new Scorpio();
		
		// Building ScorpioN
		
		
		
		IScorpioPrototype ScorpioN = prototype.clone();
		
		// Set Engine for ScorpioN 
		
		ScorpioEngine ScorpioNEngine = new ScorpioEngine();
		ScorpioN.setEngine(ScorpioNEngine);
		
		System.out.println(ScorpioN.getEngine());
		
		// Building Scorpio Classic
		
		IScorpioPrototype ScorpioClassic = prototype.clone();
		
		// Set Engine for Scorpio Classic 
		
		ScorpioEngine ScorpioClassicEnghine = new ScorpioEngine();
		
		ScorpioClassic.setEngine(ScorpioClassicEnghine);
		System.out.println(ScorpioClassic.getEngine());

	}

}
