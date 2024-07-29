package ScorpioDefenderFactory;

import java.util.ArrayList;
import java.util.Collection;

public class Car {
	VehicleFactory factory;
	IEngine engine;
	
	Car(VehicleFactory factory){
		
		this.factory = factory;
		
	};
	
	public void driveCar() {
		
		factory.createEngine();
		System.out.println("Mill gayi gaadi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory factory1 = new ScorpioVehicleFactory();
		VehicleFactory factory2 = new DefenderVehicleFactory();
		
		Car car1 = new Car(factory1);
		Car car2 = new Car(factory2);
		
		Collection<Car> list = new ArrayList<>();
		
		list.add(car1);
		list.add(car2);
		
		for(Car car : list) {
			car.driveCar();
		}			

	}

}
