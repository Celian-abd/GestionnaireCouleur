package application;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

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
    
    public void setCurrentIndex(int currentIndex) {
        if(currentIndex < this.couleurs.size()) {
            this.index = currentIndex;
            currentIndexLabel.set("Current Index: " + currentIndex);
            Couleur c = this.couleurs.get(currentIndex);
            currentColor.set(new Color(c.getRouge(), c.getVert(), c.getBleu()));
        }
    }

}
