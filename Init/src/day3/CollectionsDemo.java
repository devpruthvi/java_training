package day3;

import java.util.ArrayList;

public class CollectionsDemo {
	public static void main(String[] args) {
		
		// Demonstration that while copying two collections, deep copying has to be taken care of!
		// This will result in reflection of changes made in Copied Collection in Original Collection
		
		ArrayList<ArrayList<Integer>> nestedList = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(3);
		al2.add(4);
		nestedList.add(al1);
		nestedList.add(al2);
		ArrayList<ArrayList<Integer>> copiedNestedList = new ArrayList<ArrayList<Integer>>();
		copiedNestedList.addAll(nestedList);
		copiedNestedList.get(0).add(5);
		System.out.println(copiedNestedList.get(0).get(2));
	}
}
