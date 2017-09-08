package day2;

class A2 {
	int hi = 10;
	void m() {
		System.out.println("A");
	}
}

class B extends A2 {
	int hi = 20;
	void m() {
		System.out.println("B");
	}
	
	void m2() {
		
	}
}

public class UpCasting {
	public static void main(String[] args) {
		B b = new B();
		A2 a = b;
		System.out.println(a.hi + " " + b.hi);
		a.m();
		b.m();
	}
}
