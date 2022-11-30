package com.personal.exercices;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> myList = Arrays.asList(
				"Regex",
				"Iterable",
				"Interface");
		
		// Boucle foreach
		//		for(String item : myList) {
		//			System.out.println(item);
		//		}

		//Expression lambda
		//myList.forEach(System.out::println);
		
		//Autre syntaxe en lambda
		myList.forEach(item -> System.out.println(item));
		
	}

}
