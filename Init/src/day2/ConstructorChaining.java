package day2;

class A1 {
	public A1() {
		super();
		System.out.println("A got created");
	}
}

class B1 extends A1 {
	int a = 10;
	public B1() {
		super();
		System.out.println("B got created");
	}
}

class C1 extends B1 {
	public C1() {
		super();
		System.out.println("C got created");
	}
}



public class ConstructorChaining {
	public static void main(String[] args) {
		C1 c1 = new C1();
	}
}
