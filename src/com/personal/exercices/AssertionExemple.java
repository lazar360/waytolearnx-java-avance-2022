package com.personal.exercices;

import java.util.Scanner;

public class AssertionExemple {

	public static void main(String[] args) {
		
		Scanner monScan = new Scanner(System.in);
		System.out.println("Entrez votre age : ");
		int age = monScan.nextInt();
		
		assert age >=18 :"Invalide !";
		
		System.out.println("Votre age est : " + age);
		
		monScan.close();
		
	}

}
