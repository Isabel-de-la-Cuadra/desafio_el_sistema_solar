package desafioelsistemasolar.models;

import java.util.ArrayList;

/*
 * 3. Se requiere hacer que el sistema solar funcione, genere la clase del sistema solar
llamada SistemaSolar donde inyecte los planetas apoyándose por un
ArrayList<Planeta>, desde aquí genere dos métodos, el primero debe mostrar la
información de los planetas y el segundo deber mostrar la información de los planetas y
de sus respectivas lunas. Apóyese del método toString en ambos casos.
 */


public class SistemaSolar {

	private ArrayList<Planeta> planetas = new ArrayList<Planeta>();
	
	public void agregarPlaneta(Planeta planeta) {
		this.planetas.add(planeta);
	}
	
	public void mostrarPlanetas() {
		//recorrer variable planetas con for e imprimir to string por planeta
		for(int i = 0; i < planetas.size(); i++) {
			System.out.println(planetas.get(i));
		}	
	}
	
	public void mostrarPlanetasLunas() {
		System.out.println("--------------------------------");
		//recorrer variable planetas hacer un for de for e imprimir to string de lunas por planeta
		for(int i = 0; i < planetas.size(); i++) {
			System.out.println(planetas.get(i).toString());
			for(int j = 0; j < planetas.get(i).getLunas().size(); j++) {
				System.out.println(planetas.get(i).getLunas().get(j).toString());
			}
			System.out.println();
		}
		
	}
	
}
