package main;

import mowItNow.classPackage.Grille;
import mowItNow.classPackage.Tondeuse;

public class mainMowItNow {
	public static void main(String[] args) {
		int largeurGrille = 5;
		int longueurGrille = 5;
		int abscisseX = 1;
		int ordonneeY = 2;
		char direction = 'G';
		char orientation = 'N';
		
		Grille grilleTest = new Grille(longueurGrille, largeurGrille);
		grilleTest.afficherLargeurGrille();
		grilleTest.afficherLongueurGrille();
		
		if(grilleTest.getLongueurGrille() >= abscisseX && grilleTest.getLargeurGrille() >= ordonneeY) {
			
		Tondeuse tondeuseTest = new Tondeuse(abscisseX, ordonneeY, orientation);
		tondeuseTest.changerOrientation(orientation, direction);
		tondeuseTest.afficherCoordonneeX();
		System.out.println("");
		tondeuseTest.afficherCoordonneeY();
		System.out.println("");
		tondeuseTest.afficherOrientation();
		System.out.println("");
		
			
		} else {
			System.out.println("Vous avez choisit des coordonnées n'appartenant pas à la grille");
		}
		
		
		
	}
}
