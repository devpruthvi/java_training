package day4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Cuber {
	private long cubeMe(int n) {
		return n*n*n;
	}
}

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c = Class.forName("day4.Cuber");
		Cuber cuber = (Cuber) c.newInstance();
		Method m = cuber.getClass().getDeclaredMethod("cubeMe",int.class);
		m.setAccessible(true);
		Object r = m.invoke(cuber,3);
		System.out.println(r);
	}
}
