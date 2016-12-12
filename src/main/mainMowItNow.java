package main;
import mowItNow.classPackage.*;


public class mainMowItNow {
	public static void main(String[] args) {
		
		int largeurGrille = Integer.parseInt(args[0]);
		int longueurGrille = Integer.parseInt(args[1]);
		int abscisseX = Integer.parseInt(args[2]);
		int ordonneeY = Integer.parseInt(args[3]);
		char orientation = args[4].charAt(0);
		String directionString = args[5];
		
		Grille grilleTest = new Grille(longueurGrille, largeurGrille);
		grilleTest.afficherTailleGrille();
		
		FirstPosition firstPosition = new FirstPosition(abscisseX, ordonneeY, orientation);
		firstPosition.premieresCoordonnees();
		
		if(grilleTest.getLongueurGrille() >= abscisseX && grilleTest.getLargeurGrille() >= ordonneeY) {
			
			Tondeuse tondeuseTest = new Tondeuse(abscisseX, ordonneeY, orientation);			
			tondeuseTest.getFirstOrientation(orientation);
			
			for (int caractereDirection = 0; caractereDirection < directionString.length(); caractereDirection++) {
				tondeuseTest.changerOrientation(directionString.charAt(caractereDirection));
			}
	
			tondeuseTest.afficherResultat();
					
		} else {
			System.out.println("Vous avez choisi des coordonnées n'appartenant pas à la grille");
		}
			
	}
}
