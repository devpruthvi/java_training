package day3;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

class CallableClass implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(100);
		return "I completed at " + (new Date());
	}

}

public class CallableDemo {
	public static void main(String[] args) {
		Byte a;
		try {
			ExecutorService es = Executors.newSingleThreadExecutor();
			Future<String> result = es.submit(new CallableClass());
			Future<String> result2 = es.submit(new CallableClass());
			System.out.println("Time of submission: " + new Date());
			System.out.println("This is printed later, result: " + result.get() + " " + result2.get());
			System.out.println("Time at result: " + new Date());
			System.out.println("This will also be printed later");
			Thread t = new Thread(new Runnable() {
				public void run() {
					System.out.println("This is a thread");
				}
			});
			t.start();
			es.shutdown();
		}
		catch(ExecutionException e) {
			System.out.println("Error , task was stopped abruptly -> " + e.getCause());
		}
		catch(InterruptedException e) {
			System.out.println("Error, the thread was interrupted -> " + e.getMessage());
		}
	}
}