package SingletonPattern;

public class AircraftOne {
	
	private static AircraftOne aircraftinstance;
	
	private AircraftOne() {};
	
	public static AircraftOne getInstance() {
		
		if( aircraftinstance == null) {
			
			aircraftinstance = new AircraftOne();
		}
		
		return aircraftinstance;
	}


	public void message() {
		System.out.println("In Aircraft One method");
	}

}
