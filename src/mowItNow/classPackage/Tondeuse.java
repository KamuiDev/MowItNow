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
	public int avancerTondeuseX(int abscisseX) {
		return this.abscisseX++;
	}
	
	public int avancerTondeuseY(int ordonneeY) {
		return this.ordonneeY++;
	}
	
	public int reculerTondeuseX(int abscisseX) {
		return this.abscisseX--;
	}
	
	public int reculerTondeuseY(int ordonneeY) {
		return this.ordonneeY--;
	}
	
	public char orientation(char orientationTondeuse) {
		return this.orientationTondeuse;
	}
	
	// Méthodes publiques
	public void changerOrientation(char orientationTondeuse, char directionTondeuse) {

		if(orientationTondeuse == 'N' || orientationTondeuse == 'S' || orientationTondeuse == 'E'
		   || orientationTondeuse == 'O') {
			switch(orientationTondeuse) {
				case 'E':
					if(directionTondeuse == 'G') {
						ordonneeY = avancerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('N');
					} else if(directionTondeuse == 'D') {
						ordonneeY = reculerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('S');
					} else {
						abscisseX = avancerTondeuseX(abscisseX);
						orientationTondeuse = orientation('E');
					}
				break;
				
				case 'O' :
					if(directionTondeuse == 'G') {
						ordonneeY = reculerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('S');
					} else if(directionTondeuse == 'D') {
						ordonneeY = avancerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('N');
					} else {
						abscisseX = reculerTondeuseX(abscisseX);
						orientationTondeuse = orientation('O');
					}
				break;
				
				case 'N' :
					if(directionTondeuse == 'G') {
						this.abscisseX = reculerTondeuseX(this.abscisseX);
						orientationTondeuse = orientation('O');
					} else if(directionTondeuse == 'D') {
						abscisseX = avancerTondeuseX(abscisseX);
						orientationTondeuse = orientation('E');
					} else {
						ordonneeY = avancerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('N');
					}
				break;
				
				default :
					if(directionTondeuse == 'G') {
						abscisseX = avancerTondeuseX(abscisseX);
						orientationTondeuse = orientation('E');
					} else if(directionTondeuse == 'D') {
						abscisseX = reculerTondeuseX(abscisseX);
						orientationTondeuse = orientation('O');
					} else {
						ordonneeY = reculerTondeuseY(ordonneeY);
						orientationTondeuse = orientation('S');
					}
				break;
			
			}
		} else {
			System.out.println("Mauvaise lettre");
		}
	}
	
	public void afficherOrientation() {
		char orientationFinale = this.orientationTondeuse;
		System.out.println(orientationFinale);
	}
	
	public void afficherCoordonneeX() {
		int coordonneeXFinale = this.abscisseX;
		System.out.println(coordonneeXFinale);
	}
	
	public void afficherCoordonneeY() {
		int coordonneeYFinale = this.ordonneeY;
		System.out.println(coordonneeYFinale);
	}
	
}
