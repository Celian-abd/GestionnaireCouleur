package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCouleur {

	/**
	 * Variable globale de test
	 */
	public static Couleur couleur = new Couleur("RGB", 200, 200, 200);

	/*
	 * Test sur le constructeur de Couleur
	 */
	@Test
	public void testConstructeurCouleur() {
		assertThrows(IllegalArgumentException.class, () -> new Couleur("Une couleur", 0, 0, 300));
	}

	/*
	 * Test sur l'accesseur de la valeur Rouge
	 */
	@Test
	public void testGetterRouge() {
		assertEquals(200, couleur.getRouge());
	}

	/**
	 * Test sur l'accesseur de la valeur vert
	 */
	@Test
	public void testGetterVert() {
		assertEquals(200, couleur.getVert());
	}

	/**
	 * Test sur l'accesseur de la valeur Bleu
	 */
	@Test
	public void testGetterBleu() {
		assertEquals(200, couleur.getBleu());
	}

}
