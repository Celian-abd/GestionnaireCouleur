package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class testModelGestionnaire {

	@Test
	public void testGetsCouleurs() {
		ModelGestionnaire model = new ModelGestionnaire();
		ArrayList<Couleur> returnedList = model.getCouleurs();
		assertEquals(true,returnedList instanceof List);
	}
	
	@Test
	public void testAddCouleur() {
		ModelGestionnaire model = new ModelGestionnaire();
		model.addCouleur(new Couleur("rouge",200,0,0));
		assertEquals(1,model.getCouleurs().size());
	}
	
	@Test
	public void testGetCurrentIndex() {
		ModelGestionnaire model = new ModelGestionnaire();
		assertEquals(0,model.getCurrentIndex());
	}

}
