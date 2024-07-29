package ScorpioFactory;

public class ScorioClassic extends Scorpio{
	
	public void makeScorpio() {
		System.out.println("Scoprio Classic class me hun");
		this.engine = new ScorpioClassicEngine();
		this.bodyshell = new ScorpioClassicBodyShell();
		
	}
	
	public static void main(String[] args) {
		
		
	}
	
	

}
