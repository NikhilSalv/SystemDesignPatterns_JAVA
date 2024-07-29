package ScorpioFactory;

import java.util.ArrayList;
import java.util.Collection;

public class Scorpio {
	IEngine engine;
	IBody bodyshell;
	
	public void makeScorpio() {
		System.out.println("Scoprio class me hun");
		this.engine = new ScorpioEngine();
		this.bodyshell = new ScorpioBody();
		
	}
	
	public void drivecar(){
		makeScorpio();
		System.out.println("I am inside Scorpio Parent class");
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Scorpio> list = new ArrayList<>();
		Scorpio car1 = new ScorpioN();
		Scorpio car2 = new ScorioClassic();
		
		list.add(car1);
		list.add(car2);
		
		for(Scorpio car : list) {
			car.drivecar();
		}
		
		
//		car1.makeScorpio();
//		car1.drivecar();
		
	}

}
