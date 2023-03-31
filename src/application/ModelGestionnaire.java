package application;

import java.awt.Color;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
    
    public ModelGestionnaire(){
        this.couleurs = new ArrayList<>();
        this.index = 0;
        this.currentColor = new SimpleObjectProperty<>();
        this.currentIndexLabel = new SimpleStringProperty();
        
        try {
            // Créer un flux d'entrée pour lire le fichier binaire
            FileInputStream fichierEntree = new FileInputStream("chemin/vers/fichier/sauvegarde.bin");

            // Créer un flux d'entrée d'objet pour lire les objets sérialisés
            ObjectInputStream objetEntree = new ObjectInputStream(fichierEntree);

            // Lire tous les objets sérialisés à partir du fichier binaire
            Object objet;
            while ((objet = objetEntree.readObject()) != null) {
                // Traiter l'objet lu
                System.out.println(objet.toString());
            }

            // Fermer les flux
            objetEntree.close();
            fichierEntree.close();
        } catch (EOFException e) {
            // La fin du fichier a été atteinte
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

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
