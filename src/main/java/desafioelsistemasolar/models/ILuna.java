package desafioelsistemasolar.models;

/*
 * 1. Generar las clases Planeta y Luna con sus respectivas interfaces (IPlaneta e ILuna),
agregando atributos y sus respectivos getters, setters y toString relacionados a cada
clase (Luna: nombre, diámetro y tiempo de órbita. Planeta: Nombre, tamaño, distancia al
sol y lunas). Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna>.
 */


public interface ILuna {
	
	public String getNombre();
	public void setNombre(String nombre);
	public Integer getDiametro();
	public void setDiametro(Integer diametro);
	public Float getTiempoDeOrbita();
	public void setTiempoDeOrbita(Float tiempoDeOrbita);
	
}
