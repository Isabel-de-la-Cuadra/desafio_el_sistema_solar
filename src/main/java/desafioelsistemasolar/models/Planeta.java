package desafioelsistemasolar.models;

import java.util.ArrayList;

/*
 * 1. Generar las clases Planeta y Luna con sus respectivas interfaces (IPlaneta e ILuna),
agregando atributos y sus respectivos getters, setters y toString relacionados a cada
clase (Luna: nombre, diámetro y tiempo de órbita. Planeta: Nombre, tamaño, distancia al
sol y lunas). Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna>.
 */

public class Planeta implements IPlaneta {

	private String nombre;
	private Integer tamanio;
	private Long distanciaAlSol;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();
	
	public Planeta() {
		super();
	}

	public Planeta(String nombre, Integer tamanio, long distanciaAlSol) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaAlSol = distanciaAlSol;
	}
	
	public Planeta(String nombre, Integer tamanio, Long distanciaAlSol, ArrayList<Luna> lunas) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaAlSol = distanciaAlSol;
		this.lunas = lunas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	public long getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(long distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public ArrayList<Luna> getLunas() {
		return lunas;
	}

	public void setLunas(ArrayList<Luna> lunas) {
		this.lunas = lunas;
	}
	
	@Override
	public String toString() {
		return "El planeta de nombre " + nombre + ", tiene un tamaño de " + tamanio + 
				" kilómetro de diámetro, su distancia al Sol es de " + distanciaAlSol + 
				" kilómetros y tiene " + lunas.size() + " satélites naturales o lunas.";
	}

}
