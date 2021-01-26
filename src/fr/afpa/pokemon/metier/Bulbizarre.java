package fr.afpa.pokemon.metier;

public class Bulbizarre extends Pokemon{
	
	public static int nombre = 0; 
	public static int nombreAttaques = 0; 
	public Bulbizarre(String nom, String type, int pointsVies) {
		super(nom, type, pointsVies);
		nombre++ ;
		// TODO Auto-generated constructor stub
	}
	public void attaquer (){
		nombreAttaques ++ ;
		System.out.println("Je suis un pokémon Bulbizarre " + this.getNom() +" plante et poison et j'attaque !! ");
	}
}
