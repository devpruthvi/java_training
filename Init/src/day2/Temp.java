package day2;

abstract class Vehicle {
	int noOfWheels;
	public Vehicle(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	abstract public void ride();
}

class Bike extends Vehicle {
	int cc;
	Bike(int cc) {
		super(2);
		this.cc = cc;
	}
	
	public void ride() {
		
	}
}


class Car extends Vehicle{
	int cc;
	Car(int cc) {
		super(4);
		this.cc = cc;
	}
	
	public void ride() {
		
	}
}

public class Temp {
	
	public static void someGenericFunctionThatWorksOnAllVehicles(Vehicle v) {
		v.ride();
	}
	
	public static void main(String[] args) {
		Bike b = new Bike(100);
		Car c = new Car(200);
		someGenericFunctionThatWorksOnAllVehicles(b);
		someGenericFunctionThatWorksOnAllVehicles(c);
	}
}
