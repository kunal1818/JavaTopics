package com.topic.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.ws.soap.AddressingFeature;

public class List {
	
	public static void main(String args[]) {
	
	java.util.List<String>list = new ArrayList<>();						// ARRAYLIST
	list.add("K");
	list.add("U");
	list.add("N");
	list.add("A");
	list.add("L");
	
	Iterator<String> iterator = list.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}

	System.out.println("***********************************");

	Collections.sort(list);											// SORTING OF LIST
	for (String string : list) {
		System.out.println(string);
	}
	System.out.println("***********************************");
	
	
	LinkedList<String>linkedList = new LinkedList<String>();	  	// LINKLIST 
	linkedList.add("Ravi");  
	linkedList.add("Vijay");  
	linkedList.add("Ravi");  
	linkedList.add("Ajay");  
	linkedList.addFirst("Kunal");  // adding at first index	of list
	linkedList.addLast("Lokesh");  // adding at last index of list
	  Iterator<String> itr=linkedList.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }
	
	  System.out.println("***********************************");
		
	  Object clone = linkedList.clone();			// CLONING OF LIST
	System.out.println(clone.toString());
}
}