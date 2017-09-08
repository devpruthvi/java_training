package day2;

import java.util.Arrays;
import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		String temp = new String("Good Afternoon!");
		byte[] bytes = temp.getBytes();
		System.out.println(Arrays.toString(bytes));
		String s1 = "Hel";
		String s2 = "Hello";
		System.out.println(s1 + " " + s1.hashCode() + " " + Arrays.toString(s1.getBytes()));
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}
}
