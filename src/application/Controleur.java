package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class Controleur {
	
	@FXML
	private Button ajouter;
	
	@FXML
	private Button sauvegarde;
	
	@FXML
	private Button supprimer;
	
	@FXML
	private TextField fnom;
	
	@FXML
	private TextField frouge;
	
	@FXML
	private TextField fvert;
	
	@FXML
	private TextField fbleu;
	
	@FXML
	private Rectangle rectangle;
	
	private ModelGestionnaire modele = new ModelGestionnaire(); 
	
	public void ajouterCouleur() {
		int r = Integer.parseInt(frouge.getText());
		int v = Integer.parseInt(fvert.getText());
		int b = Integer.parseInt(fbleu.getText());
		
		this.modele.addCouleur(new Couleur(fnom.getText(),r,v,b));		
	}
	
}
