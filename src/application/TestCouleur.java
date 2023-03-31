package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCouleur {

	@Test
	public void testConstructeurCouleur() {
		assertThrows(IllegalArgumentException.class, () -> new Couleur("Une couleur",0,0,300));
	}
	
	@Test
	public void testGetterRouge() {
		Couleur rouge = new Couleur("Une couleur",200,0,0);
		assertEquals(200,rouge.getRouge());
	}
	
	@Test
	public void testGetterVert() {
		Couleur vert = new Couleur("Une couleur",0,200,0);
		assertEquals(200,vert.getVert());
	}


}
