import tp1.Joueur;
import tp1.Nourriture;
import tp1.Pokemon;
import tp1.Gourmandise;
import tp1.Potionmagique;
import java.util.Scanner;

public class ChasseAuxPokemons {

	public static void main(String[] args) {
		
		//Elles ne compileront pas car il n'y a plus le booleen "diurne ou nocturne"	
		final Pokemon p1 = new Pokemon("Piplup","EAU",5, true, 50,0,50);
		final Pokemon p2 = new Pokemon("Rowlet","PLANTE",10, false, 50,0,50);
		final Pokemon p3 = new Pokemon("Totodile","EAU",8, true, 50,0,50);
		final Pokemon p4 = new Pokemon("Aflamanoir","FEU",7, true, 50,0,50);
		final Pokemon p5 = new Pokemon("B�tochef","COMBAT",7, true, 50,0,50);
		final Pokemon p6 = new Pokemon("Elektek","ELECTRIQUE",7, true, 50,0,50);
		final Pokemon p7 = new Pokemon("Boumata","DRAGON",7, true, 50,0,50);

		
		//Les joueurs	
		final Joueur joueur1 = new Joueur("Durant","Sachat",20,new Pokemon[5]);
		final Joueur joueur2 = new Joueur("Dupont","Pierre",20, new Pokemon[5]);
		final Joueur joueur3 = new Joueur("Morales","Andrea",20,new Pokemon[5]);
		final Joueur joueur4 = new Joueur("Ze�a","Carla",20, new Pokemon[5]);
		
		// Nourriture
		final Nourriture Nourriture1 = new Nourriture(35,"Tartiflette",new String[30]);
		final Nourriture Nourriture2 = new Nourriture(10,"Ratatouille",new String[30]);
		// la nourriture
		final Nourriture tartiflette = new Nourriture(35,"tartiflette", new String[] {"DRAGON", "FEU", "COMBAT", "EAU", "ELECTRIQUE"});
		final Nourriture ratatouille = new Nourriture(10, "ratatouille", new String[] {"PLANTE", "EAU", "VOL", "FEU", "NORMAL", "ELECTRIQUE", "COMBAT"}); 
		final Nourriture carotte = new Nourriture(2, "carotte", new String[] {"PLANTE", "TERRE", "VOL"});
		//La compatibilite n'est pas termin�e
		final Gourmandise barreChocolatee = new Gourmandise(20,"Barre Chocolatee",new String[] {"PLANTE"},10,7,5);
		final Potionmagique mojito = new Potionmagique(0,"mojito",new String[] {"FEU"});
		
		//Test tp5� partie 2
		joueur1.capturer(p1);
		joueur1.capturer(p2);
		joueur1.capturer(p4);
		joueur1.donner(p1, joueur2);
		joueur1.donner(p2, joueur3);
		joueur2.regarderPokemon(p1);
		joueur3.regarderPokemon(p2);
		
		joueur2.ajoutNourriture(tartiflette);
		joueur2.ajoutNourriture(carotte);
		joueur2.ajoutNourriture(barreChocolatee);
		joueur2.afficheCaisseNourriture();
		joueur2.ajoutNourriture(mojito);
		joueur3.ajoutNourriture(ratatouille);
		joueur3.ajoutNourriture(mojito);
		joueur3.afficheCaisseNourriture();
		System.out.println(p2.getAppetit());
		joueur2.nourrir(p1, 2);//On le donne de la nourriture qui n'est pas compatible
		joueur3.nourrir(p1, 2);//On essaye de nourrir un pokemon qui ne  lui appartient pas
		joueur2.nourrir(p1, 4);//On utilise une caisse qui contient null
		joueur3.nourrir(p2, 0);//On donne de la nourriture compatible au pokemon qui lui appartient 
		System.out.println(p2.getAppetit());
		joueur3.afficheCaisseNourriture();//On a bien verifi� que la nourriture  a bien disparu apr�s de  faire manger au pokemon
		/*mojito.estMangee(p2);
		barreChocolatee.estMangee(p2);
		
		mojito.estMangee(p4);
		barreChocolatee.estMangee(p4);

		//
				System.out.println(carotte);
				for (int i = 0; i < 10; i++) {
					System.out.println(tartiflette.genAlea());
					System.out.println(ratatouille.genAlea());
				}
				Scanner lecteur = new Scanner(System.in);
				System.out.println("");
				String reponse = "";
				while (!reponse.equals("stop")) {
					Nourriture n = carotte.genAlea();
					if (n == null) {
						System.out.println("Vous n'avez rien trouve. Si vous voulez vous arreter, tapez << stop >> . Sinon, tapez << non >> .");
					reponse = lecteur.next();
				while (!reponse.equals("non") && reponse.equals("stop")) {
					System.out.println("Refaites votre choix. Tapez << stop >> ou << non >>");
					reponse = lecteur.next();
				}
				} else {
					System.out.println("Vous avez trouve un(e) " + n.getIngredient() + ".");
					System.out.println("Voulez vous la prendre ? << oui / non / stop>>");
					reponse = lecteur.next();
				while (!reponse.equals("oui") && !reponse.equals("non") && !reponse.equals("stop")) {
					System.out.println("Repetez votre choix s.v.p. Il faut taper << oui >>, << non >> ou << stop >>");
					reponse = lecteur.next();
				}
				if (reponse.equals("oui")) {
					System.out.println("Vous avez pris le/la " +
					n.getIngredient() + ".");
					System.out.println("Voulez-vous vous arreter ? Tapez << stop >>. Sinon, tapez << non >>");
					reponse = lecteur.next();
					while (!reponse.equals("non") && !reponse.equals("stop")) {
						if (reponse.equals("stop")) {
							System.out.println("Refaites votre choix. Tapez << stop >> ou << non >>");
							reponse = lecteur.next();
						}
					}
				}
				while(p7.getAppetit()!=0){
					System.out.println();
					System.out.println(p7.getAppetit());
					p7.mange(carotte);
					System.out.println(p7.getAppetit());
				}
			}	
		}*/
	}
}