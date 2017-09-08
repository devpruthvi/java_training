
public class SingleInheritance {
	class Vehicle {
		String color;
		String regNumber;
		
		protected Vehicle(String color, String regNumber) {
			this.color = color;
			this.regNumber = regNumber;
			
		}
		
		public void ride() {
			System.out.println("I am riding a Vehicle");
		}
		
	}
	
	class Bike extends Vehicle {
		public static final int numWheels = 2;
		public Bike(String color,String regNumber) {
			super(color,regNumber);
		}
		public void ride() {
			System.out.println("I am riding a Bike!");
		}
	}
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		Bike b = s.new Bike("Red","AP02KA1234");
		b.ride();
		System.out.println(b.numWheels);
	}
}


class HierarchialInheritance {
	class Animal {
		
	}
	
	class Dog extends Animal {
		
	}
	
	class Human extends Animal {
		
	}
	
	class Vegiterian extends Human {
		
	}
	
	class NonVegiterian extends Human {
		
	}
	
}