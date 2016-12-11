package main;

import mowItNow.classPackage.Grille;
import mowItNow.classPackage.Tondeuse;

public class mainMowItNow {
	public static void main(String[] args) {
		int largeurGrille = 5;
		int longueurGrille = 5;
		int abscisseX = 1;
		int ordonneeY = 2;
		String directionString = "AAAGD";
		char orientation = 'N';
		
		Grille grilleTest = new Grille(longueurGrille, largeurGrille);
		grilleTest.afficherTailleGrille();
		
		if(grilleTest.getLongueurGrille() >= abscisseX && grilleTest.getLargeurGrille() >= ordonneeY) {
			
			Tondeuse tondeuseTest = new Tondeuse(abscisseX, ordonneeY, orientation);
			
			tondeuseTest.getFirstOrientation(orientation);
			
			for (int caractereDirection = 0; caractereDirection < directionString.length(); caractereDirection++) {
				tondeuseTest.changerOrientation(directionString.charAt(caractereDirection));
			}
			tondeuseTest.afficherResultat();
			System.out.println(directionString);
					
		} else {
			System.out.println("Vous avez choisi des coordonnées n'appartenant pas à la grille");
		}
		
		
		
	}
}
