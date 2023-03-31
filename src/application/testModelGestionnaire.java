package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestModelGestionnaire {

	/*
	 * Test de l'acceseur sur la liste des couleurs
	 */
	@Test
	public void testGetsCouleurs() {
		ModelGestionnaire model = new ModelGestionnaire();
		List<Couleur> returnedList = model.getCouleurs();
		assertEquals(true,returnedList instanceof List);
	}
	
	/*
	 * Test de l'ajout d'une couleur dans la collection
	 */
	@Test
	public void testAddCouleur() {
		ModelGestionnaire model = new ModelGestionnaire();
		model.addCouleur(new Couleur("rouge",200,0,0));
		assertEquals(1,model.getCouleurs().size());
	}
	
	/*
	 * Test de l'accesseur sur l'index courant
	 */
	@Test
	public void testGetCurrentIndex() {
		ModelGestionnaire model = new ModelGestionnaire();
		assertEquals(0,model.getCurrentIndex());
	}
	
	/*
	 * Test de la modification de l'index courrant
	 */
	@Test
	public void testSetCurrentIndex() {
		ModelGestionnaire model = new ModelGestionnaire();
		int i = 0;
		model.setCurrentIndex(i);
		assertEquals(i,model.getCurrentIndex());
	}

}
