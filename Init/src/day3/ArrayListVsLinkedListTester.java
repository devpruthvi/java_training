package day3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ArrayListVsLinkedListTester {
	
	public static void arrayListTimer() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<500000;i++)
			a.add((int)(Math.random()*100) % 10);
		System.out.println("ArrayList deletion started at -> " + new Date());
		while(a.size() > 1)
			a.remove(0);
		System.out.println("ArrayList deletion completed at -> " + new Date());
	}
	
	public static void linkedListTimer() {
		LinkedList<Integer> a = new LinkedList<Integer>();
		for(int i=0;i<2000000;i++)
			a.add((int)(Math.random()*100) % 10);
		System.out.println("LinkedList deletion started at -> " + new Date());
		while(a.size() > 1)
			a.remove(0);
		System.out.println("LinkedList deletion completed at -> " + new Date());
	}
	
	public static void main(String[] args) {
		
		arrayListTimer();
		linkedListTimer();
	}
}
