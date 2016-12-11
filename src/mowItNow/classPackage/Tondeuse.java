package mowItNow.classPackage;

public class Tondeuse {
	
	// Attributs
	private int abscisseX;
	private int ordonneeY;
	private char orientationTondeuse;
	
	// Constructeur de la classe Tondeuse
	public Tondeuse(int abscisseX, int ordonneeY, char orientationTondeuse) {
		
		this.abscisseX = abscisseX;
		this.ordonneeY = ordonneeY;
		this.orientationTondeuse = orientationTondeuse;
		
	}	
	// Méthodes privées
	private int avancerTondeuseX(int abscisseX) {
		return this.abscisseX++;
	}
	
	private int avancerTondeuseY(int ordonneeY) {
		return this.ordonneeY++;
	}
	
	private int reculerTondeuseX(int abscisseX) {
		return this.abscisseX--;
	}
	
	private int reculerTondeuseY(int ordonneeY) {
		return this.ordonneeY--;
	}
	
	// Méthodes publiques
	public void changerOrientation(char orientationTondeuse, char directionTondeuse) {

			switch(orientationTondeuse) {
				case 'E':
					if(directionTondeuse == 'G') {
						avancerTondeuseY(ordonneeY);
						orientationTondeuse = 'N';
					} else if(directionTondeuse == 'D') {
						reculerTondeuseY(ordonneeY);
						orientationTondeuse = 'S';
					} else {
						avancerTondeuseX(abscisseX);
						orientationTondeuse = 'E';
					}
				break;
				
				case 'O' :
					if(directionTondeuse == 'G') {
						reculerTondeuseY(ordonneeY);
						orientationTondeuse = 'S';
					} else if(directionTondeuse == 'D') {
						avancerTondeuseY(ordonneeY);
						orientationTondeuse = 'N';
					} else {
						reculerTondeuseX(abscisseX);
						orientationTondeuse = 'O';
					}
				break;
				
				case 'N' :
					if(directionTondeuse == 'G') {
						reculerTondeuseX(abscisseX);
						orientationTondeuse = 'O';
					} else if(directionTondeuse == 'D') {
						avancerTondeuseX(abscisseX);
						orientationTondeuse = 'E';
					} else {
						avancerTondeuseY(ordonneeY);
						orientationTondeuse = 'N';
					}
				break;
				
				case 'S' :
					if(directionTondeuse == 'G') {
						avancerTondeuseX(abscisseX);
						orientationTondeuse = 'E';
					} else if(directionTondeuse == 'D') {
						reculerTondeuseX(abscisseX);
						orientationTondeuse = 'O';
					} else {
						reculerTondeuseY(ordonneeY);
						orientationTondeuse = 'S';
					}
				break;
				
				default: 
					System.out.println("mauvaise Lettre");
				break;
			
			}
			
			System.out.println(abscisseX + " " + ordonneeY + " " + orientationTondeuse);
				
	}
	
	
}
