package day3;

class Counter implements Runnable {
	
	String threadName;
	public static Integer a;
	
	Counter(String threadName, Integer a) {
		this.threadName = threadName;
		this.a = a;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			a += (int)(Math.random() * 10) % 6;
			if( a > 32000 ) {
				a /= 2;
			}
			System.out.println(this.threadName + " : " + i);
			System.out.println("A value : " + "(" + this.threadName + " - " + ")" + a);
		}
	}
	
}


public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		Integer a = new Integer(1);
		Counter c1 = new Counter("Raj",a);
		Counter c2 = new Counter("Madhu",a);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		
		// Java doesn't consider thread priorities, although, thread priorities 
		// act as hints to Underlying OS in the case when threads compete for resources.
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t1.start();
		Thread.sleep(1000);
		System.out.println("IS EQUAL: " + (c1.a == c2.a));
		System.out.println(c1.a + " hi " + c2.a);
	}
}
