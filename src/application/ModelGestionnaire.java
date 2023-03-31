package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class ModelGestionnaire {

	/*
	 * Liste des couleurs presente
	 */
	private List<Couleur> couleurs;
	/*
	 * Chemin d'accès du sauvegarde
	 */
    public static final String NOM_FIC = "sauvegardes.bin";
    /*
     * Index de la couleur sur lequel l'utilisateur a cliqué
     */
    private int index;
    
    /*
     * Constructeur du Gestionnaire de couleur avec chargement du fichier de sauvegarde dans la liste
     */
    public ModelGestionnaire(){
        this.couleurs = new ArrayList<>();
        this.index = 0;
        
        FileInputStream fichierEntree = null;
        ObjectInputStream objetEntree = null;
        try {
        	String fileUrl = getClass().getResource(NOM_FIC).getPath();

            // Créer un flux d'entrée pour lire le fichier binaire
            fichierEntree = new FileInputStream(fileUrl);

            // Créer un flux d'entrée d'objet pour lire les objets sérialisés
            objetEntree = new ObjectInputStream(fichierEntree);

            // Lire tous les objets sérialisés à partir du fichier binaire
            Object objet;
            while ((objet = objetEntree.readObject()) != null) {
                this.couleurs.add((Couleur)objet);
            }
            objetEntree.close();
            fichierEntree.close();
        } catch (EOFException e) {
            // La fin du fichier a été atteinte
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

    


}
