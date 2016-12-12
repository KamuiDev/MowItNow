package mowItNow.classPackage;

public class FirstPosition {
	
	private int positionX;
	private int positionY;
	private char firstOrientation;	
	
	public FirstPosition(int positionX, int positionY, char firstOrientation) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.firstOrientation = firstOrientation;
	}
	
	public void premieresCoordonnees() {
		System.out.println(positionX + " " + positionY + " " + firstOrientation);
	}
	
}
