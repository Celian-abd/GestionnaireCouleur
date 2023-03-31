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

}
