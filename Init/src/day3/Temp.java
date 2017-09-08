package day3;

import java.util.ArrayList;

public class Temp {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a1.add(a);
		ArrayList<ArrayList<Integer>> a2 = new ArrayList<ArrayList<Integer>>();
		a2.addAll(a1);
		a1.get(0).add(2);
		System.out.println(a2.get(0).get(1));
	}
}
