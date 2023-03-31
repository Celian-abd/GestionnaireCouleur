package application;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class Controleur {
	
	@FXML
	private Button ajouter,supprimer,sauvegarde;
	@FXML
	private TextField field_nom,field_rouge,field_vert,field_bleu;
	
	@FXML
	private Rectangle rectangle;
	
	private ModelGestionnaire modele = new ModelGestionnaire();
	
	public void ajouterCouleur(Event evt) {
		int r = Integer.parseInt(field_rouge.getText());
		int v = Integer.parseInt(field_vert.getText());
		int b = Integer.parseInt(field_bleu.getText());
		
		this.modele.addCouleur(new Couleur(field_nom.getText(),r,v,b));		
	}
}
