package com.topic.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		
		HashSet<String> hashSet= new HashSet<String>();       // HASH SET	
		hashSet.add("K");
		hashSet.add("U");
		hashSet.add("K");
		hashSet.add("A");
		hashSet.add("A");
		for (String string : hashSet) {
			System.out.println(string);
		}
		System.out.println("***********************************");
		LinkedHashSet<String> linkedHashSet= new LinkedHashSet<String>();  // LINK HASH SET
		linkedHashSet.add("K");
		linkedHashSet.add("U");
		linkedHashSet.add("K");
		linkedHashSet.add("A");
		linkedHashSet.add("A");
		for (String string : linkedHashSet) {
			System.out.println(string);
		}
		
		System.out.println("***********************************");
		TreeSet<String> treeSet= new TreeSet<String>();					// TREE SET
		treeSet.add("K");
		treeSet.add("U");
		treeSet.add("K");
		treeSet.add("A");
		treeSet.add("A");
		for (String string : treeSet) {
			System.out.println(string);
		}
		
	}

}
