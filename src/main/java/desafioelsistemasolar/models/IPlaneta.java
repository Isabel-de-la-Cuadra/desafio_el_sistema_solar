package desafioelsistemasolar.models;

import java.util.ArrayList;

/*
 * 1. Generar las clases Planeta y Luna con sus respectivas interfaces (IPlaneta e ILuna),
agregando atributos y sus respectivos getters, setters y toString relacionados a cada
clase (Luna: nombre, diámetro y tiempo de órbita. Planeta: Nombre, tamaño, distancia al
sol y lunas). Debe inyectar la clase Luna en Planeta con ayuda de ArrayList <Luna>.
 */

public interface IPlaneta {

	public String getNombre();
	public void setNombre(String nombre);
	public Integer getTamanio();
	public void setTamanio(Integer tamanio);
	public long getDistanciaAlSol();
	public void setDistanciaAlSol(long distanciaAlSol);
	public ArrayList<Luna> getLunas();
	public void setLunas(ArrayList<Luna> lunas);

}
