package fr.afpa.pokemon.metier;

import java.util.ArrayList;
import java.util.List;

public class TestPokemon {

	
	public static void main(String[] args) {
		
		List<Pokemon> listePokemons = new ArrayList<Pokemon>() ;

	/*	
		Pokemon pok = new Pokemon("Brigitte","Feu",0) ;
		
		System.out.println(pok.toString());
		pok.setNom("olivier");
		System.out.println(pok.toString());
		*/
		//
		Carapuce pokDemoniak = new Carapuce("Brigitte","Eau",0, "Vert") ;
		listePokemons.add(pokDemoniak) ;
		Carapuce pokDemon = new Carapuce() ;
		listePokemons.add(pokDemon) ;
		
		Bulbizarre pokBul = new Bulbizarre("BriBul","Plante et poison",0) ;
		listePokemons.add(pokBul) ;
		Bulbizarre pokBul2 = new Bulbizarre("BriPoison","Plante et poison",0) ;
		listePokemons.add(pokBul2) ;
		
		Salameche poksal1 = new Salameche("Brifeu","feu",0) ;
		Salameche poksal = new Salameche("salfeu","feu",0) ;
		Salameche poksalBis = new Salameche("salfeu","feu",0) ;
		listePokemons.add(poksal1) ;
		listePokemons.add(poksal) ;
		listePokemons.add(poksalBis) ;
		
		// On affiche nos pokémon
		
		System.out.println("\n On affiche nos pokémons \n ");
		System.out.println(pokDemoniak.toString());
		System.out.println(pokDemon.toString());
		System.out.println(pokBul.toString());
		System.out.println(pokBul2.toString());
		System.out.println(poksal1.toString());
		System.out.println(poksal.toString());
		
		// Nos pokémon attaquent !!
		System.out.println("\n nos pokémons attaquent \n ");
		
		pokDemoniak.attaquer();
		pokDemon.attaquer();
		pokBul.attaquer();
		pokBul.attaquer();
		pokBul2.attaquer();
		poksal1.attaquer();
		poksal.attaquer();
		poksal.attaquer();
		poksal.attaquer();
		pokDemon.attaquer();
		pokDemon.attaquer();
		pokDemon.attaquer();
		// on appelle les méthodes et attributs statiques
		System.out.println("\n On comptes les nombres de pokémons et le nombre de leurs attaques \n ");
		System.out.println("le nombre de Pokemon (Total ) est "+Pokemon.nombre );
		System.out.println("le nombre de Bulbizarre est "+Bulbizarre.nombre );
		System.out.println("le nombre d'attaques des Bulbizarres est "+Bulbizarre.nombreAttaques );
		System.out.println("le nombre de Salameche est "+Salameche.nombre );
		System.out.println("le nombre d'attaques des Salameches est "+Salameche.nombreAttaques );
		System.out.println("le nombre de Carapuce est "+Carapuce.nombre );
		System.out.println("le nombre d'attaques des Carapuce est "+Carapuce.nombreAttaques );
		Pokemon.afficherNombre();
		
		
		
		// Je compare mes pokémons
		/*	Salameche poksal = new Salameche("salfeu","feu",0) ;
		Salameche poksalBis = new Salameche("salfeu","feu",0) ;
		 * */
		System.out.println("Mes pokémons sont les mêmes  "+poksal.equals(poksalBis) );
		// J'appelle la méthode qui est dans pokemon
		System.out.println("\n J'appelle la méthode qui est dans pokemon");
		Pokemon.afficherPokemon(listePokemons);
		// J'appelle la méthode qui est dans cette classe TestPokemon
		System.out.println("\n J'appelle la méthode qui est dans cette classe TestPokemon");
		afficherPokemon(listePokemons);
		
	} // fin de main
	
	
	public static void afficherPokemon(List<Pokemon> listepok){
		for(Pokemon pk :listepok ) {
		System.out.println(pk.toString());
		}
	}
	
	
	
}
