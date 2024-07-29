package DecoratorPattern;

public class BulletProof extends ScorpioDecorator{
	
	ICar scorpio;
	
	

	public BulletProof(ICar meriScorpio) {
		super();
		this.scorpio = meriScorpio;
	}

	public void start() {
		// TODO Auto-generated method stub
		
		scorpio.start(); 
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		scorpio.stop();
		
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return 300 + scorpio.getWeight();
	}

	
	public static void main(String[] args) {
		
		ICar newScorpio = new Scorpio();
		ICar bfScorpio = new BulletProof(newScorpio);
		
		System.out.println(bfScorpio.getWeight());
		
		
	}

}
