package com.informatics.lambdaDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachDemo1 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();

		myList.add("1");
		myList.add("2");
		myList.add("3");
		myList.add("4");
		myList.add("5");

		Iterator<String> it = myList.iterator();
		
		//iterating using while loop
		/*while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
		}*/
		//iterating using forEach
		/*myList.forEach(( x)-> {System.out.println(x);
									});*/
		//iterating using forRach and displaying data using method reference
		myList.forEach(System.out::println);

	}

}
