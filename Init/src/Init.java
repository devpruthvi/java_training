

class Init {
	private static int a = 20;
	static class inner {
		static void m() {
			System.out.println(a);
		}
	}
	
	public static boolean isArmstrong(int a) {
		long sum = 0;
		int orig = a;
		while(a != 0) {
			sum += Math.pow(a % 10,3);
			a /= 10;
		}
		return sum == orig;
	}
	public static void main(String[] args) {
		
	}
}
class Employee {
	int id;
	String name;
	double salary;
	public static final double tax = 1000;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getSal() {
		double da = salary * 1.50;
		double hra = salary * 0.3;
		double netsal = salary + hra + da - tax;
		return netsal;
	}
	
}