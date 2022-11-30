package com.personal.exercices;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String input;
		Scanner monScan = new Scanner(System.in);   
		Pattern myPattern = Pattern.compile("(bon|jour)", Pattern.CASE_INSENSITIVE);
		Matcher myMatcher;
		
		System.out.println("Bonjour !");
		System.out.println("Veuillez taper une expression :");
		input = monScan.nextLine();
		System.out.println(input);
		
		myMatcher = myPattern.matcher(input);
		
		System.out.println(myMatcher.find());
		
		monScan.close();
		
	}

}
