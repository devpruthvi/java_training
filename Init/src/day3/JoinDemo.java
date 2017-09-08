package day3;

class NamedThread extends Thread {
	String name;
	
	NamedThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(this.name + " " + i);
	}
}

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new NamedThread("Thread1");
		Thread t2 = new NamedThread("---------Thread2--------");
		Thread t3 = new NamedThread("Thread3");
		t1.start();
		t2.start();
		t2.join();
		t3.start();
	}
}
