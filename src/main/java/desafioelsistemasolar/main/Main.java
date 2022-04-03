package desafioelsistemasolar.main;

import java.util.ArrayList;

import desafioelsistemasolar.models.Luna;
import desafioelsistemasolar.models.Planeta;
import desafioelsistemasolar.models.SistemaSolar;

public class Main {

	public static void main(String[] args) {
		
		//Crear las lunas por planeta		
		ArrayList<Luna> lunasTierra = new ArrayList<Luna>();
		Luna lunaTierra = new Luna("Luna", 3476, 27.322F);
		lunasTierra.add(lunaTierra);
		
		ArrayList<Luna> lunasMarte = new ArrayList<Luna>();
		Luna lunaMarte01 = new Luna("Deimos", 8, 1.263F);
		Luna lunaMarte02 = new Luna("Phobos", 28, 0.319F);
		lunasMarte.add(lunaMarte01);
		lunasMarte.add(lunaMarte02);
		
		ArrayList<Luna> lunasJupiter = new ArrayList<Luna>();
		Luna lunaJupiter01 = new Luna("Calisto", 4800, 16.689F);
		Luna lunaJupiter02 = new Luna("Ganimides", 5276, 7.155F);
		lunasJupiter.add(lunaJupiter01);
		lunasJupiter.add(lunaJupiter02);
		
		ArrayList<Luna> lunasSaturno = new ArrayList<Luna>();
		Luna lunaSaturno01 = new Luna("Dione", 1120, 2.737F);
		Luna lunaSaturno02 = new Luna("Mimas", 398, 0.942F);
		lunasSaturno.add(lunaSaturno01);
		lunasSaturno.add(lunaSaturno02);
			
		ArrayList<Luna> lunasUrano = new ArrayList<Luna>();
		Luna lunaUrano01 = new Luna("Ariel", 1160, 2.520F);
		Luna lunaUrano02 = new Luna("Desdemona", 54, 0.474F);
		lunasUrano.add(lunaUrano01);
		lunasUrano.add(lunaUrano02);
		
		ArrayList<Luna> lunasNeptuno = new ArrayList<Luna>();
		Luna lunaNeptuno01 = new Luna("Galatea", 140, 0.400F);
		Luna lunaNeptuno02 = new Luna("Proteus", 420, 1.120F);
		lunasNeptuno.add(lunaNeptuno01);
		lunasNeptuno.add(lunaNeptuno02);
		
		ArrayList<Luna> lunasPluton = new ArrayList<Luna>();
		Luna lunaPluton01 = new Luna("Charon", 1207, 6.387F);
		Luna lunaPluton02 = new Luna("Nix", 44, 24.856F);
		lunasPluton.add(lunaPluton01);
		lunasPluton.add(lunaPluton02);
		
		//Crear los planetas e inyectar sus lunas
		Planeta planetaMercurio = new Planeta("Mercurio", 4480, 57910000l);
		Planeta planetaVenus = new Planeta("Venus", 12104, 108200000l);
		Planeta planetaTierra = new Planeta("Tierra", 12756, 149600000l, lunasTierra);
		Planeta planetaMarte = new Planeta("Marte", 6794, 227940000l, lunasMarte);
		Planeta planetaJupiter = new Planeta("Jupiter", 142986, 77830000l, lunasJupiter);
		Planeta planetaSaturno = new Planeta("Saturno", 108728, 1429400000l, lunasSaturno);
		Planeta planetaUrano = new Planeta("Urano", 51118, 2870990000l, lunasUrano);
		Planeta planetaNeptuno = new Planeta("Neptuno", 49532, 4504300000l, lunasNeptuno);
		Planeta planetaPluton = new Planeta("Plutón", 2320, 5913520000l, lunasPluton);
		
		//Agregar los planetas en el sistemaSolar
		
		SistemaSolar sistemaSolar = new SistemaSolar();
		
		sistemaSolar.agregarPlaneta(planetaMercurio);
		sistemaSolar.agregarPlaneta(planetaVenus);
		sistemaSolar.agregarPlaneta(planetaTierra);
		sistemaSolar.agregarPlaneta(planetaMarte);
		sistemaSolar.agregarPlaneta(planetaJupiter);
		sistemaSolar.agregarPlaneta(planetaSaturno);
		sistemaSolar.agregarPlaneta(planetaUrano);
		sistemaSolar.agregarPlaneta(planetaNeptuno);
		sistemaSolar.agregarPlaneta(planetaPluton);
		
		sistemaSolar.mostrarPlanetas();
		sistemaSolar.mostrarPlanetasLunas();
		
	}

}
