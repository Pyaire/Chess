package chess;

/** Class abstraite pour cration de pi�ce
* @author Pierre Ansel
* @version 0.0.0.0.1
*/
public abstract class Piece {
	
	//Attributes:  
	
	/** position abcisse */
	private char posX;
	
	/** position ordonn� */
	private int posY;
	
	/** appartenance � l'�quipe */
	private final String couleur;
	
	/** savoir si la pi�ce est encore sur la plateau */
	private boolean vivant;
	
	//Constructor:
	
	public Piece(char x, int y, String color,boolean alive) {
		posX = x;
		posY = y;
		if (color.equals("blanc")) couleur = "blanc";
		else if (color.equals("noir")) couleur = "noir";
		else couleur = null;
		vivant = alive;
	}
}
