package desafioelsistemasolar.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import desafioelsistemasolar.models.Luna;
import desafioelsistemasolar.models.Planeta;

/*
2. Se deberán crear pruebas unitarias con la dependencia de Junit relacionando a los
planetas y sus lunas, debe probar: las cantidades de Lunas por planeta (utilice
assertEquals), los nombre de planetas, sus lunas ingresadas correctamente (utilice
assertTrue) y comprobar que las cantidades de lunas (utilice assertTrue). No es
necesario que pruebe con cada planeta, solo utilice el que más le guste, pero debe tener
al menos cuatro pruebas diferentes.

4. Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna> y agregar usando
Junit las pruebas unitarias de las cantidades de Lunas por planeta (utilice assertEquals).
(Opcional)
 */

public class SistemaSolarTest {
	
	@Test
	public void cantidadLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna("Luna", 3476, 2.322F);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta("Tierras", 12756, 149600000l, lunasTierrasTest);
		
		assertEquals(1,planetaTest.getLunas().size());
	}
	
	@Test
	public void AgregarLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna("Luna", 3476, 2.322F);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta("Tierras", 12756, 149600000l, lunasTierrasTest);
		
		assertTrue(planetaTest.getLunas().size()>0);
	
	}
	
	@Test
	public void ComprobarCantidadLunasNullTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Planeta planetaTest = new Planeta("Tierras", 12756, 149600000l, lunasTierrasTest);
		
		assertTrue(planetaTest.getLunas().size()==0);
	
	}
	
	@Test
	public void ComprobarCantidadLunasTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest = new Luna("Luna", 3476, 2.322F);
		lunasTierrasTest.add(lunaTierrasTest);
		Planeta planetaTest = new Planeta("Tierras", 12756, 149600000l, lunasTierrasTest);
		
		assertTrue(planetaTest.getLunas().size()==1);
	
	}
	
	
	@Test
	public void lunasArrayListTest() {
		
		ArrayList<Luna> lunasTierrasTest = new ArrayList<Luna>();
		Luna lunaTierrasTest01 = new Luna("Luna", 3476, 2.322F);
		Luna lunaTierrasTest02 = new Luna("Luna", 3477, 2.323F);
		lunasTierrasTest.add(lunaTierrasTest01);
		lunasTierrasTest.add(lunaTierrasTest02);
		Planeta planetaTest = new Planeta("Tierras", 12756, 149600000l, lunasTierrasTest);
		
		assertEquals(2,planetaTest.getLunas().size());
	}
	
	
}
