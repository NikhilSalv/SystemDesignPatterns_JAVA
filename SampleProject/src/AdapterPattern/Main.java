package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotAirBalloon balloonUsed = new HotAirBalloon();
		
		Adapter obj = new Adapter(balloonUsed);
		obj.start();

	}

}
