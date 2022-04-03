package desafioelsistemasolar.models;

/*
 * 1. Generar las clases Planeta y Luna con sus respectivas interfaces (IPlaneta e ILuna),
agregando atributos y sus respectivos getters, setters y toString relacionados a cada
clase (Luna: nombre, diámetro y tiempo de órbita. Planeta: Nombre, tamaño, distancia al
sol y lunas). Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna>.
 */

public class Luna implements ILuna {

	private String nombre;
	private Integer diametro;
	private Float tiempoDeOrbita;
	
	public Luna() {
		super();
	}
	
	public Luna(String nombre, Integer diametro, Float tiempoDeOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoDeOrbita = tiempoDeOrbita;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public Float getTiempoDeOrbita() {
		return tiempoDeOrbita;
	}

	public void setTiempoDeOrbita(Float tiempoDeOrbita) {
		this.tiempoDeOrbita = tiempoDeOrbita;
	}

	@Override
	public String toString() {
		return " Su satélite natural tiene por nombre " + nombre + ", tiene un diámetro de " + diametro + 
				" kilómetros y un tiempo de órbita alrededor del planeta de " + tiempoDeOrbita + " días.";
	}

}
