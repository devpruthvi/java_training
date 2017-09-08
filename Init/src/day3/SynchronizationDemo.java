package day3;

public class SynchronizationDemo {
	// Alternatively, You can mark the method as synchronized.
	// They are similar. Internally , mutex will be on the object if you use intrinsic locks by Synchronization
	
	public void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=10;i++)
				System.out.println(n + "*" + i + " = " + (n*i));
		}
	}
	
	public static void main(String[] args) {
		SynchronizationDemo  s = new SynchronizationDemo();
		Integer i = 10;
		Thread tableFour = new Thread(new Runnable() {
			@Override
			public void run() {
				s.printTable(4);
			}
		});
		Thread tableEight = new Thread(new Runnable() {
			@Override
			public void run() {
				s.printTable(8);
			}
		});
		tableFour.start();
		tableEight.start();
	}

}
