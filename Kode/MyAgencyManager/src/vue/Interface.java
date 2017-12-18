package vue;

import modele.MyAgencyManager;
import modele.client.*;

public class Interface {

	public static GroupeCommande accueil = new GroupeCommande();
	
	//http://baptiste-wicht.developpez.com/tutoriels/java/outils/executables/#LIII-B
	
	public static void main(String[] args) {
		
		MyAgencyManager mAM = new MyAgencyManager();
		
		Client c1 = new ClientPhysique("testee","1 rue labas","0123456789","jsp@gmail.fr");
		
		mAM.getListeClients().add(c1);
		
		/*
		 * G�rer Client
		 */
		Commande gererClient = new Commande("G�rer un Client");
			Commande creerClient = new CommandeCreer("Cr�er un Client","c");
			Commande voirClients = new CommandeVoirs("Voir la liste des Clients","c");

		GroupeCommande SousGererC = new GroupeCommande();
			SousGererC.add(creerClient);
			SousGererC.add(voirClients);
		gererClient.setGroupeCommande(SousGererC);
		
		
		/*
		 * G�rer Bien
		 */
		Commande gererBien = new Commande("G�rer un Bien");
			Commande creerBien = new CommandeCreer("Cr�er un Bien","b");
			Commande voirBiens = new CommandeVoirs("Voir la liste des Biens","b");
	
		GroupeCommande SousGererB = new GroupeCommande();
			SousGererB.add(creerBien);
			SousGererB.add(voirBiens);
		gererBien.setGroupeCommande(SousGererB);
		
		/*
		 * G�rer RDV
		 */
		Commande gererRDV = new Commande("G�rer un RDV");
			Commande creerRDV = new CommandeCreer("Cr�er un RDV","r");
			Commande voirRDVs = new CommandeVoirs("Voir la liste des RDVs","r");
	
		GroupeCommande SousGererRDV = new GroupeCommande();
			SousGererRDV.add(creerRDV);
			SousGererRDV.add(voirRDVs);
		gererRDV.setGroupeCommande(SousGererRDV);

			
		/*
		 * G�rer Mandats
		 */
		Commande gererMandant = new Commande("G�rer un Mandat");
			Commande voirMandants = new CommandeVoirs("Voir la liste des Mandats","m");
	
		GroupeCommande SousGererM = new GroupeCommande();
			SousGererM.add(voirMandants);
		gererMandant.setGroupeCommande(SousGererM);
			
		/*
		 * G�rer Publicit�s
		 */
		Commande gererPub = new Commande("G�rer une Publicit�");
			Commande creerPub = new CommandeCreer("Cr�er une Publicit�","p");
			Commande voirPubs = new CommandeVoirs("Voir la liste des Publicit�es","p");
	
		GroupeCommande SousGererP = new GroupeCommande();
			SousGererP.add(creerPub);
			SousGererP.add(voirPubs);
		gererPub.setGroupeCommande(SousGererP);
		
			
		/*
		 * Faire stats
		 */
		Commande faireStat= new CommandeStats("Faire des Statistiques");
		
		/*
		 * Quitter l'application
		 */
		Commande sauvQuit= new CommandeQuit("Sauvegarder et Quitter");
		
		accueil.add(gererClient);
		accueil.add(gererBien);
		accueil.add(gererRDV);
		accueil.add(gererMandant);
		accueil.add(gererPub);
		accueil.add(faireStat);
		accueil.add(sauvQuit);
		
		accueil.exec();
	}

}