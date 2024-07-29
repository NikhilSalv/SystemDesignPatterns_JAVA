package AdapterPattern;

public class HotAirBalloon {
	
	String gas = "Helium";
	
	public void start(String gas) {
		System.out.print(gas);
	}

	public String getGas() {
		return gas;
	}

}
