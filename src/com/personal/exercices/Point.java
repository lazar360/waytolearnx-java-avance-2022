package com.personal.exercices;

import java.util.Objects;

public class Point {

	private int x,y;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

//	Pourquoi il a affiché « Not Equal »? 
	//La raison est simple: lorsque nous comparons p1 et p2, il vérifie si p1 et p2 se réfèrent au même objet 
	//(les variables d’objet sont toujours des références en Java). p1 et p2 se réfèrent à deux objets différents, donc la valeur (p1 == p2) est false.
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	public class Main { 
	    public static void main(String[] args) { 
	 
	    	Point point1 = new Point(1,2);
	    	Point point2 = new Point(1,2);
	    	
	    	if(point1.equals(point2)) {
	    		System.out.println("equals");
	    	} else {
	    		System.out.println("not equals");
	    	}
	    	
	    	
	    }
	}
	
}


