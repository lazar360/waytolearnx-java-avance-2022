package com.personal.exercices;

//créer un thread en héritant de la classe thread
public class MultithreadingEx extends Thread{
//on peut créer un thread en implémentant l'interface Runnable
	//La syntaxe de création du thread est différente (cf.waytolearnx)
	
	//une méthode au hasard
	public void run(){  
	    System.out.println("Mon thread est en cours d'exécution.");  	    
	} 
	
	
	//fait démarrer le thread
	public static void main(String[] args) {
		MultithreadingEx thread = new MultithreadingEx();   
	     thread.start();  
	}

}
