package PrototypePatternRevised;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICarRevised remoteProxy = new RemoteProxy();
		
		remoteProxy.turnLeft();
		remoteProxy.turnRight();
		remoteProxy.goStaright();

	}

}
