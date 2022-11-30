package com.personal.exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
	    
		//1: Le mode de fonctionnement d'un stream
		//----------------------------------------
	    System.out.println("1/Le mode de fonctionnement d'un stream \n-----------");
		List<String> maListe = Arrays.asList("a1", "a2", "b2", "b1", "c1");
	    maListe.stream()
	           .filter(s -> s.startsWith("b"))// opérations intermédiaires :Renvoie un streamm
	           .map(String::toUpperCase) // opérations intermédiaires
	           .sorted() // opérations intermédiaires
	           .forEach(System.out::println);//opération terminale :Renvoie autre chose 
	    //L'ensemble des opérations = pipeline
	    
	    // Sortie B1 et B2
	    
	    //2 : les opérations d'un stream
	    //------------------------------
	    System.out.println("\n2/Les opérations d'un stream \n-----------");
	    List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	    
	    List<Integer> troisPremierNombrePairAuCarre = 
	    	      nombres.stream()//source alimente le stream
	    	             .filter(n -> {
	    	                 System.out.println("filter " + n);
	    	                 return n % 2 == 0;
	    	              })
	    	             .map(n -> {
	    	                 System.out.println("map " + n);
	    	                 return n * n;
	    	              })
	    	             .limit(3)
	    	             .toList();

	    	    System.out.println("");
	    	    troisPremierNombrePairAuCarre.forEach(System.out::println);
	    
	    /*
Pour filtrer des données, un Stream propose plusieurs opérations :
------------------------------------------------------------------
filter(Predicate) : renvoie un Stream qui contient les éléments pour lesquels l'évaluation du Predicate passé en paramètre vaut true

/!\ distinct() : renvoie un Stream qui ne contient que les éléments uniques (elle retire les doublons). La comparaison se fait grâce à l'implémentation de la méthode equals()

limit(n) : renvoie un Stream que ne contient comme éléments que le nombre fourni en paramètre
skip(n) : renvoie un Stream dont les n premiers éléments sont ignorés

Pour rechercher une correspondance avec des éléments, un Stream propose plusieurs opérations :
---------------------------------------------------------------------------------------------
anyMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur au moins un élément vaut true
allMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur tous les éléments vaut true
noneMatch(Predicate) : renvoie un booléen qui précise si l'évaluation du Predicate sur tous les éléments vaut false
findAny() : renvoie un objet de type Optional qui encapsule un élément du Stream s'il existe
findFirst() : renvoie un objet de type Optional qui encapsule le premier élément du Stream s'il existe

Pour transformer des données, un Stream propose plusieurs opérations :
----------------------------------------------------------------------
map(Function) : applique la Function fournie en paramètre pour transformer l'élément en créant un nouveau
flatMap(Function) : applique la Function fournie en paramètre pour transformer l'élément en créant zéro, un ou plusieurs éléments

Pour réduire les données et produire un résultat, un Stream propose plusieurs opérations :
-----------------------------------------------------------------------------------------
reduce() : applique une Function pour combiner les éléments afin de produire le résultat
collect() : permet de transformer un Stream qui contiendra le résultat des traitements de réduction dans un conteneur mutable

Pour créer une liste
--------------------
toList()

-------------

long somme = entiers.stream()
                        .filter(v -> v <10)
                        .mapToInt(i -> i)
                        .sum();
    System.out.println(somme);

resultat = personnes
      .stream()
      .filter(p -> p.getGenre() == Genre.FEMME)
      .mapToInt(p -> p.getTaille())
      .average()
      .getAsDouble();
    System.out.println("Taille moyenne des femmes = " + resultat);

	     */
	    
	    	    //Exemples de code :
				List<Personne> lesPersonnes = new ArrayList<>();
				lesPersonnes.add(new Personne("p1", 178, Genre.HOMME));
				lesPersonnes.add(new Personne("p2", 168, Genre.FEMME));
				lesPersonnes.add(new Personne("p3", 150, Genre.FEMME));
				lesPersonnes.add(new Personne("p4", 200, Genre.HOMME));
				lesPersonnes.add(new Personne("p5", 190, Genre.HOMME));
				lesPersonnes.add(new Personne("p6", 170, Genre.FEMME));
	    	   
				List<String> employesHomme = 
	    	    	      lesPersonnes.stream()
	    	    	              .filter(l -> l.getGenre() == Genre.HOMME)
	    	               .sorted(Comparator.comparingInt(Personne::getTaille).reversed())    	    	              								  .map(Personne::getNom)
	    	    	              .collect(Collectors.toList());
						System.out.println("\n3/Tri Homme");
						System.out.println("-----------");
	    	    	    employesHomme.forEach(System.out::println);
	    	    
	    	   
	    	    
	
	    	   
	    	   
	    	   
	}

}
