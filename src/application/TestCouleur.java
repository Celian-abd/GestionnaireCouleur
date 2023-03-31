package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

class TestCouleur {

	@Test
	public void whenExceptionThrown_thenRuleIsApplied() {
		assertThrows(IllegalArgumentException.class, () -> new Couleur("Une couleur",0,0,300));
	}

}
