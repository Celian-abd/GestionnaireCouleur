package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCouleur {

	public static Couleur couleur = new Couleur("RGB", 200, 200, 200);

	@Test
	public void testConstructeurCouleur() {
		assertThrows(IllegalArgumentException.class, () -> new Couleur("Une couleur", 0, 0, 300));
	}

	@Test
	public void testGetterRouge() {
		assertEquals(200, couleur.getRouge());
	}

	@Test
	public void testGetterVert() {
		assertEquals(200, couleur.getVert());
	}

	@Test
	public void testGetterBleu() {
		assertEquals(200, couleur.getBleu());
	}

}
