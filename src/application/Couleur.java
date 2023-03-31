package application;

public class Couleur {
	
	private String nom;
	
	private int rouge;
	private int vert;
	private int bleu;
	
	public Couleur(String nom, int rouge,int vert,int bleu) throws IllegalArgumentException{
		if((rouge<0 || rouge >255) || (vert<0 || vert>255) || (bleu<0 || bleu>0)){
			throw new IllegalArgumentException("Vous devez entrer une couleur RGB valide !");
		}
		this.nom = nom;
		this.rouge = rouge;
		this.vert = vert;
		this.bleu = bleu;
		
	}
	
	public int getRouge() {
		return this.rouge;
	}
	
	public int getVert() {
		return this.vert;
	}

}
