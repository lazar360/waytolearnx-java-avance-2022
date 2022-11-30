package com.personal.exercices;

public class Personne{

	private String nom; 
	private int taille;
	Genre genre;
	
	public Personne() {
	}

	public Personne(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
		
	}

	public Personne(String nom, int taille, Genre genre) {
		this.nom = nom;
		this.taille = taille;
		this.genre = genre;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	
	
	
}
