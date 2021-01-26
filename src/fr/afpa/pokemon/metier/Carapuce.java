package fr.afpa.pokemon.metier;

public class Carapuce extends Pokemon {

	String couleur= "Transparent" ;
	
	public static int nombre = 0; 
	public static int nombreAttaques = 0; 
	
	
	public Carapuce() {
		super();
		nombre++ ;
		// TODO Auto-generated constructor stub
	}

	public Carapuce(String nom, String type, int pointsVies , String couleur) {
		super(nom, type, pointsVies);
		this.couleur = couleur ;
		nombre++ ;
	}

	public Carapuce(String couleur) {
		super();
		this.couleur = couleur;
		nombre++ ;
	}
	
	
	public void attaquer (){
		nombreAttaques ++ ;
		System.out.println("Je suis un pokémon carapuce " + this.getNom() +"eau  et j'attaque !! ");
	}

	@Override
	public String toString() {
		return "Carapuce [couleur=" + couleur + ", " + super.toString() + "]";
	}
	
	
	

}
