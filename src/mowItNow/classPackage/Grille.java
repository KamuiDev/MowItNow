package mowItNow.classPackage;

public class Grille {
	
	private int longueurX;
	private int largeurY;
	
	public Grille(int longueurX, int largeurY) {
		this.longueurX = longueurX;
		this.largeurY = largeurY;
	}
	
	public int getLongueurGrille() {
		return this.longueurX;
	}
	
	public int getLargeurGrille() {
		return this.largeurY;
	}
	
	public void afficherTailleGrille() {
		System.out.println(longueurX + " " + largeurY);
	}
	
}
