package application;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.paint.Color;

public class ModelGestionnaire {

	private ArrayList<Couleur> couleurs;
    private static final String nomFichier = "sauvegardes.bin";
    private int index;
    private SimpleObjectProperty<Color> currentColor;
    private SimpleStringProperty currentIndexLabel;
    
    public ModelGestionnaire() {
        this.couleurs = new ArrayList<>();
        this.index = 0;
        this.currentColor = new SimpleObjectProperty<>();
        this.currentIndexLabel = new SimpleStringProperty();
    }
    
    public ArrayList<Couleur> getCouleurs() {
        return this.couleurs;
    }
    
    public void addCouleur(Couleur couleur) {
    	this.couleurs.add(couleur);
    }
    
    public int getCurrentIndex() {
        return index;
    }

}
