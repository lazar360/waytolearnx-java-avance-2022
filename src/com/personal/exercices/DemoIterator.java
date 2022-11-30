package com.personal.exercices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoIterator {

	public static void main(String[] args) {

		List<String> maListe = Arrays.asList(
				"Chips",
				"Crevettes",
				"Vin",
				"Saucisson"
				);
		
		//Afficher la liste		
		Iterator<String> monIterator = maListe.listIterator();
		
		//Parcourir en avant
		//------------------
		System.out.println(" ======> Parcours maListe");
		while(monIterator.hasNext()) {
			System.out.println(monIterator.next());
		}
		
	}

}
