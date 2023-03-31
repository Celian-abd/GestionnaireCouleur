package application;

import java.awt.Color;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

public class ModelGestionnaire {

	/*
	 * Liste des couleurs presente
	 */
	private List<Couleur> couleurs;
	/*
	 * Chemin d'accès du sauvegarde
	 */
    private static final String nom_fic = "sauvegardes.bin";
    /*
     * Index de la couleur sur lequel l'utilisateur a cliqué
     */
    private int index;
    /*
     * Object pour mettre a jour le rectangle de couleur dans l'interface
     */
    private SimpleObjectProperty<Color> currentColor;
    /*
     * Object pour mettre a jour le label correspondant a la couleur selectionné
     */
    private SimpleStringProperty currentIndexLabel;
    
    /*
     * Constructeur du Gestionnaire de couleur avec chargement du fichier de sauvegarde dans la liste
     */
    public ModelGestionnaire(){
        this.couleurs = new ArrayList<>();
        this.index = 0;
        this.currentColor = new SimpleObjectProperty<>();
        this.currentIndexLabel = new SimpleStringProperty();
        
        FileInputStream fichierEntree = null;
        ObjectInputStream objetEntree = null;
        try {
        	String fileUrl = getClass().getResource(nom_fic).getPath();

            // Créer un flux d'entrée pour lire le fichier binaire
            fichierEntree = new FileInputStream(fileUrl);

            // Créer un flux d'entrée d'objet pour lire les objets sérialisés
            objetEntree = new ObjectInputStream(fichierEntree);

            // Lire tous les objets sérialisés à partir du fichier binaire
            Object objet;
            while ((objet = objetEntree.readObject()) != null) {
                this.couleurs.add((Couleur)objet);
            }

        } catch (EOFException e) {
            // La fin du fichier a été atteinte
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            // Fermer les flux
        	if(objetEntree != null) {
        		try {
                    objetEntree.close();
                    fichierEntree.close();
        		}catch(IOException e){
        			System.out.println("Erreur lors de la fermeture du FileInputStream ou de ObjectInputStream!");
        		}
        	}
        }

    }
    
    /*
     * Renvoit la liste des couleurs enregistrer
     */
    public List<Couleur> getCouleurs() {
        return this.couleurs;
    }
    
    /*
     * Ajoute la couleur a la collection
     */
    public void addCouleur(Couleur couleur) {
    	this.couleurs.add(couleur);
    }
    
    /*
     * Renvoit l'indice sur lequel on est positionné
     */
    public int getCurrentIndex() {
        return index;
    }
    
    /*
     * Mets a jour toutes les informations et notamment le label et le rectangle de couleur
     */
    public void setCurrentIndex(int currentIndex) {
        if(currentIndex < this.couleurs.size()) {
            this.index = currentIndex;
            currentIndexLabel.set("Current Index: " + currentIndex);
            Couleur c = this.couleurs.get(currentIndex);
            currentColor.set(new Color(c.getRouge(), c.getVert(), c.getBleu()));
        }
    }

}
