package SingletonPattern;

public class Main {
	
//	AircraftOne.instance;

	

	
	public static void main(String[] args) {
//		AircraftOne.aircraftinstance = new AircraftOne();
		AircraftOne obj = AircraftOne.getInstance();
		System.out.println(obj);
//		AircraftOne.instance;

		// TODO Auto-generated method stub

	}

}
