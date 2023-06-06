package tr.edu.medipol.yova;


import static org.junit.Assert.*;

import org.junit.Test;

public class PartiOylariTest {

	@Test
	public void testPartiOyArttir() {
		PartiOylari.partiOyArttir("A");
        PartiOylari.partiOyArttir("B");
        PartiOylari.partiOyArttir("B");
        assertEquals(1, PartiOylari.getPartiAOy());
        assertEquals(3, PartiOylari.getPartiBOy());
        assertEquals(0, PartiOylari.getPartiCOy());
	}

	@Test
	public void testPartiOyAzalt() {
		
		PartiOylari.partiOyArttir("A");
        PartiOylari.partiOyArttir("B");
        PartiOylari.partiOyAzalt("A");
        assertEquals(0, PartiOylari.getPartiAOy());
        assertEquals(1, PartiOylari.getPartiBOy());
        assertEquals(0, PartiOylari.getPartiCOy());
	}

	@Test
	public void testPartiOyListele() {
		String expected = "Parti A: 1\n" +
			              "Parti B: 3\n" +
			              "Parti C: 0\n";
		assertEquals(expected, PartiOylari.partiOyListele());
	}

}
