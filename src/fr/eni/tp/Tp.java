package fr.eni.tp;

import java.util.Scanner;

public class Tp {
// Afficher le temps de cuisson d'une viande en fonction du type de la viande, du :ode de cuisson et du poids de la viande saisis par l'utilisateur
	
	
	public static void main(String[] args) {
		
		
		//Paramètres de base :
		int beefWeightBase = 500;
		int beefMinutesBleuBase = 10;
		int beefMinutesMediumBase = 17;
		int beefMinutesWellDoneBase = 25;
		
		int porcWeightBase = 400;
		int porcMinutesBleuBase = 15;
		int porcMinutesMediumBase = 25;
		int porcMinutesWellDoneBase = 40;
		
		int minutesToSeconds = 60;
		
		// demander le type de viande :
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le numéro lié à votre choix de viande (1-Boeuf ou 2-Porc) :");
		int meatType = scanner.nextInt();
		
		
		//selon le choix de la viande demander le poids et la cuisson et renvoyer le résultat :
		
		switch(meatType)
		{
		case 1 : System.out.println("Veuillez saisir le poids de la viande en grammes :");
					int meatWeightBeef = scanner.nextInt();
					System.out.println("Veuillez saisir le numéro lié au type de cuisson (1-Bleu, 2-A point ou 3-Bien cuit) :");
					int cookingTypeBeef = scanner.nextInt();
					switch(cookingTypeBeef)
					{
					case 1 : System.out.println("Le temps de cuisson pour une viande de Boeuf bleue de "+meatWeightBeef +" grammes est de : "+ (int)(((float)(minutesToSeconds*beefMinutesBleuBase)/beefWeightBase)*meatWeightBeef) +" secondes" );break;
					case 2 : System.out.println("Le temps de cuisson pour une viande de Boeuf à point de "+meatWeightBeef +" grammes est de : "+ (int)(((float)(minutesToSeconds*beefMinutesMediumBase)/beefWeightBase)*meatWeightBeef) +" secondes" );break;
					case 3 : System.out.println("Le temps de cuisson pour une viande de Boeuf bien cuit de "+meatWeightBeef +" grammes est de : "+ (int)(((float)(minutesToSeconds*beefMinutesWellDoneBase)/beefWeightBase)*meatWeightBeef) +" secondes" );break;
					default : System.out.println("Erreur");			
					}
					break;
		
		case 2 : System.out.println("Veuillez saisir le poids de la viande en grammes :");
					int meatWeightPorc = scanner.nextInt();
					System.out.println("Veuillez saisir le numéro lié au type de cuisson (1-Bleu, 2-A point ou 3-Bien cuit) :");
					int cookingTypePorc = scanner.nextInt();
					switch(cookingTypePorc)
					{
					case 1 : System.out.println("Le temps de cuisson pour une viande de Porc bleue de "+meatWeightPorc +" grammes est de : "+ (int)(((float)(minutesToSeconds*porcMinutesBleuBase)/porcWeightBase)*meatWeightPorc) +" secondes" );break;
					case 2 : System.out.println("Le temps de cuisson pour une viande de Porc à point de "+meatWeightPorc +" grammes est de : "+ (int)(((float)(minutesToSeconds*porcMinutesMediumBase)/porcWeightBase)*meatWeightPorc) +" secondes" );break;
					case 3 : System.out.println("Le temps de cuisson pour une viande de Porc bien cuit de "+meatWeightPorc +" grammes est de : "+ (int)(((float)(minutesToSeconds*porcMinutesWellDoneBase)/porcWeightBase)*meatWeightPorc) +" secondes" );break;
					default : System.out.println("Erreur");			
					}
					break;
		
		
		
		default : System.out.println("Erreur");
		
		}
		

	}

}
