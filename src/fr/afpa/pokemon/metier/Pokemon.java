package fr.afpa.pokemon.metier;

import java.util.List;

public class Pokemon {
// Les attributs
	
	private  String nom  ;
	private String type ;
	private int  pointsVies ;
	public static int nombre = 0 ; 
	public static int nombreAttaques = 0; 

	public Pokemon() {
		super();
	nom = "pokemon" ;
	type = "feu" ;
	pointsVies = 0;
	nombre++ ;
	}


	
	public Pokemon(String nom, String type, int pointsVies) {
		super();
		nombre++ ;
		this.nom = nom;
		this.type = type;
		this.pointsVies = pointsVies;
	}
	
	public static void afficherNombre() {
		System.out.println("\n Le nombre total des Pokémons "+nombre);

	}
	
	public void attaquer (){
		nombreAttaques ++ ;
		System.out.println("Je suis un pokémon et j'attaque !! ");
	}
	
	@Override
	public String toString() {
		return "nom=" + nom + ", type=" + type + ", pointsVies=" + pointsVies + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPointsVies() {
		return pointsVies;
	}

	public void setPointsVies(int pointsVies) {
		this.pointsVies = pointsVies;
	}

	
	public static void afficherPokemon(List<Pokemon> listepok){
		for(Pokemon pk :listepok ) {
		System.out.println(pk.toString());
		}
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pointsVies;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (pointsVies != other.pointsVies)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	
	
	
	

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + pointsVies;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	
	
	



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pointsVies != other.pointsVies)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	*/
	
	

	
	
	
	
}
