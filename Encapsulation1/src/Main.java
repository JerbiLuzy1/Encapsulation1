
public class Main {

	public static void main(String[] args) {

		
	Compte compte = new Compte () ;
		
		//Acc�es aux attributs via les getters et setters
		
		compte.setNcompte(223);
		System.out.println(compte.getNcompte());
		compte.setSolde(302);
		System.out.println(compte.getSolde());



		
		
		//Impossible d'acc�der aux attributs de la classe Compte sans les getters et les setters (car attributs d�calar�s en private) voici un exemple :
		
		//compte.Ncompte = 302 ; ici la variable Ncompte n'est pas reconnue dans la classe Main car elle est d�calr�e en priv�e dans la classe Compte.
		//compte.Solde = 100 ; idem pour la variable compte.

	}

		
		
	}


