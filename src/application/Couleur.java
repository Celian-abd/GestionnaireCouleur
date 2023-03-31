package application;

public class Couleur {
	
	/*
	 * Nom de la couleur
	 */
	private String nom;
	
	/**
	 * Attributs rerésentant les couleurs RGB
	 */
	private int rouge;
	private int vert;
	private int bleu;
	
	/*
	 * Constructeur de Couleur : 
	 * Nom : le nom de la couleur
	 * Rouge : valeur du rouge de 0 a 255
	 * Vert : valeur du Vert de 0 a 255
	 * Bleu : valeur du Bleu de 0 a 255
	 */
	public Couleur(String nom, int rouge,int vert,int bleu) throws IllegalArgumentException{
		if((rouge<0 || rouge >255) || (vert<0 || vert>255) || (bleu<0 || bleu>250)){
			throw new IllegalArgumentException("Vous devez entrer une couleur RGB valide !");
		}
		this.nom = nom;
		this.rouge = rouge;
		this.vert = vert;
		this.bleu = bleu;
		
	}
	
	/**
	 * Accesseur sur la valeur de rouge
	 * @return un entier de 0 a 255
	 */
	public int getRouge() {
		return this.rouge;
	}
	
	/**
	 * Accesseur sur la valeur de vert
	 * @return entier de 0 a 255
	 */
	public int getVert() {
		return this.vert;
	}
	
	/**
	 * Accesseur sur la valeur de bleu
	 * @return entier de 0 a 255
	 */
	public int getBleu() {
		return this.bleu;
	}
	
	/**
	 * Renvoit le nom de la couleur
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}

}
