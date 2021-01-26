package fr.afpa.pokemon.metier;

public class Salameche extends Pokemon {
	public static int nombre= 0 ; 
	public static int nombreAttaques = 0; 
	public Salameche(String nom, String type, int pointsVies) {
		super(nom, type, pointsVies);
		nombre++ ;
		// TODO Auto-generated constructor stub
	}
	
	public void attaquer (){
		nombreAttaques ++ ;
		System.out.println("Je suis un pokémon Salameche " + this.getNom() + " feu et j'attaque !! ");
	}
	
	
	

}
