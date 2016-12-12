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
		int abscisseX2 = Integer.parseInt(args[6]);
		int ordonneeY2 = Integer.parseInt(args[7]);
		char orientation2 = args[8].charAt(0);
		String directionString2 = args[9];
		
		Grille grilleTest = new Grille(longueurGrille, largeurGrille);
		/*grilleTest.afficherTailleGrille();*/
		
		/*FirstPosition firstPosition = new FirstPosition(abscisseX, ordonneeY, orientation);
		firstPosition.premieresCoordonnees();*/
		
		if(grilleTest.getLongueurGrille() >= abscisseX && grilleTest.getLargeurGrille() >= ordonneeY) {
			
			Tondeuse tondeuseTest = new Tondeuse(abscisseX, ordonneeY, orientation);			
			tondeuseTest.getFirstOrientation(orientation);
			
			Tondeuse tondeuseTest2 = new Tondeuse(abscisseX2, ordonneeY2, orientation2);			
			tondeuseTest2.getFirstOrientation(orientation2);
			
			for (int caractereDirection = 0; caractereDirection < directionString.length(); caractereDirection++) {
				tondeuseTest.changerOrientation(directionString.charAt(caractereDirection));
			}
			
			for (int caractereDirection2 = 0; caractereDirection2 < directionString2.length(); caractereDirection2++) {
				tondeuseTest2.changerOrientation(directionString2.charAt(caractereDirection2));
			}
	
			tondeuseTest.afficherResultat();
			tondeuseTest2.afficherResultat();
					
		} else {
			System.out.println("Vous avez choisi des coordonnées n'appartenant pas à la grille");
		}
			
	}
}
