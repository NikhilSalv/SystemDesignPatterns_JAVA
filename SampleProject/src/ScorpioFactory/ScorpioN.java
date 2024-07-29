package ScorpioFactory;

//import ScorpioNEngine;

public class ScorpioN extends Scorpio {
	
	@Override
	public void makeScorpio() {
		System.out.println("ScoprioN class me hun");
		this.engine = new ScorpioNEngine();
		this.bodyshell = new ScorpioNBodyShell();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


	}

}
