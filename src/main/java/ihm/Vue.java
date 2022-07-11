package ihm;

import java.util.Scanner;

public class Vue {
	private Scanner sc;
	
	public void init() {
		this.sc = new Scanner(System.in);
	}
	
	public void closeScanner() {
		this.sc.close();
	}
	
	public char inputChar() {
		char charToReturn;
		String input = this.sc.nextLine();
		if(input.length() > 0) {
			charToReturn = input.charAt(0);
		}
		else {
			charToReturn = ' ';
		}
		return charToReturn;
	}
	
	public void displayGeneralMenu(boolean isFilesLoaded) {
		System.out.println("\n\n\n\n");
		System.out.println("  **********************************************");
		System.out.println("  *                                            *");
		System.out.println("  * Recensement                                *");
		System.out.println("  *                                            *");
		System.out.println("  * Menu :                                     *");
		System.out.println("  *                                            *");
		if (!isFilesLoaded) {
			System.out.println("  * 0 : Initialisation des données             *");
		} 
		else {

			System.out.println("  * 1 : Population d'une ville                 *");
			System.out.println("  * 2 : Population d'un département            *");
			System.out.println("  * 3 : Population d'une région                *");
			System.out.println("  * 4 : Les dix régions les plus peuplées      *");
			System.out.println("  * 5 : Les dix départements les plus peuplés  *");
			System.out.println("  * 6 : Les dix villes les plus peuplées       *");
			System.out.println("  *     d'un département                       *");
			System.out.println("  * 7 : Les dix villes les plus peuplées       *");
			System.out.println("  *     d'une région                           *");
			System.out.println("  * 8 : Les dix villes les plus peuplées       *");
			System.out.println("  *     de France                              *");
		}
		System.out.println("  * Q : quitter l'application                  *");
		System.out.println("  *                                            *");
		System.out.println("  **********************************************");
		System.out.print("\n  Saisir votre choix et validez : ");
	}
	
	public void displayQuitMessage() {
		System.out.println("\n\n  Fin du programme.");
	}
	
	public void displayContinue() {
		System.out.println("\n  'C' pour continuer :");
	}

	public void waitForCToContinue() {
		char choice;
		do {
			this.displayContinue();
			String choiceString2 = this.sc.next();
			choice = choiceString2.charAt(0);
		} 
		while (choice != 'C' && choice != 'c');
	}

}

